package com.projetoTEA5.demo.repository;

import com.projetoTEA5.demo.model.Dependent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DependentRepository extends JpaRepository<Dependent, Long> {

    @Override
    Optional<Dependent> findById(Long aLong);
}
