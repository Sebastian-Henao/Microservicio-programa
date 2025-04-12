package com.edu.uceva.programaservice.domain.exception;

public class ProgramaExistenteException extends RuntimeException {
    public ProgramaExistenteException(String nombre) {super("El programa con nombre " + nombre + " ya existe en la base de datos");}
}
