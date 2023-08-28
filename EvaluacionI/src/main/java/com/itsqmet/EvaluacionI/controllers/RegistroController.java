package com.itsqmet.EvaluacionI.controllers;

import com.itsqmet.EvaluacionI.entidades.Registro;
import com.itsqmet.EvaluacionI.repositorios.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RegistroController {
    @Autowired //Inyectar dependencias al repositorio de empleados
    RegistroRepository registroRepository;

    @GetMapping("/#formulario")
    public String formulario(Model model){
        model.addAttribute("registro", new Registro());
        return "/#formulario";
    }

    @GetMapping ("/lista")
    public String lista(Model model){
        List<Registro> registros = registroRepository.findAll();
        model.addAttribute("registros", registros);
        return "lista";
    }

    @PostMapping("/")
    public String crear(Registro registro){
        registroRepository.save(registro);
        return "redirect:/lista";
    }
}
