package com.edu.uceva.programaservice.domain.repository;

import com.edu.uceva.programaservice.domain.model.Programa;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface que hereda de CrudRepository para realizar la operaciones de CRUD sobre la entidad Programa
public interface IProgramaRepository extends JpaRepository<Programa, Long> {
}
