package com.itsqmet.EvaluacionI.repositorios;

import com.itsqmet.EvaluacionI.entidades.Registro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository extends JpaRepository <Registro, Integer> {

}
