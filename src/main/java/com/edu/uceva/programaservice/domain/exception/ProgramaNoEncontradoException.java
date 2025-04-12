package com.edu.uceva.programaservice.domain.exception;

public class ProgramaNoEncontradoException extends RuntimeException {
    public ProgramaNoEncontradoException(long id) {
        super("El programa con id " + id + " no fue encontrado");
    }
}
