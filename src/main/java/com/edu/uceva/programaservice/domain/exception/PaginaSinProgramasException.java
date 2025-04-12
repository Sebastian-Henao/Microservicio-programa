package com.edu.uceva.programaservice.domain.exception;

public class PaginaSinProgramasException extends RuntimeException {
    public PaginaSinProgramasException(int page) {
        super("No hay programa en la pagina solicitada" + page);
    }
}