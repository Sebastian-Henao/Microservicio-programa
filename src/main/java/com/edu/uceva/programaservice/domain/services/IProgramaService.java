package com.edu.uceva.programaservice.domain.services;

import com.edu.uceva.programaservice.domain.model.Programa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

// Interface que define los metodos que se pueden realizar sobre la entidad Programa
public interface IProgramaService {
    Programa save(Programa programa);
    void delete(Programa programa);
    Optional<Programa> findById(long id);
    Programa update(Programa programa);
    List<Programa> findAll();
    Page<Programa> findAll(Pageable pageable);
}
