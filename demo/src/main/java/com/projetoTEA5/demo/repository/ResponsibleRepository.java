package com.projetoTEA5.demo.repository;

import com.projetoTEA5.demo.model.Responsible;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResponsibleRepository extends JpaRepository<Responsible, Long> {

    Responsible findByEmail(String email);
}