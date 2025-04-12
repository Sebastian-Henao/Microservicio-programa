package com.edu.uceva.programaservice.domain.services;

import com.edu.uceva.programaservice.domain.model.Programa;
import com.edu.uceva.programaservice.domain.repository.IProgramaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

// Clase que implementa los metodos de la interfaz IProgramaService para realizar las operaciones de negocio sobre la entidad Programa
@Service
public class ProgramaServiceImpl implements IProgramaService {
    IProgramaRepository programaRepository;
    public ProgramaServiceImpl(IProgramaRepository programaRepository) {this.programaRepository = programaRepository;}

    @Override
    @Transactional
    public Programa save(Programa programa) {return programaRepository.save(programa);}

    @Override
    @Transactional
    public void delete(Programa programa) {programaRepository.delete(programa);}

    @Override
    @Transactional(readOnly = true)
    public Optional<Programa> findById(long id) {return programaRepository.findById(id);}

    @Override
    @Transactional
    public Programa update(Programa programa) {return programaRepository.save(programa);}

    @Override
    @Transactional(readOnly = true)
    public List<Programa> findAll() {return programaRepository.findAll();}

    @Override
    @Transactional(readOnly = true)
    public Page<Programa> findAll(Pageable pageable) {return programaRepository.findAll(pageable);}
}
