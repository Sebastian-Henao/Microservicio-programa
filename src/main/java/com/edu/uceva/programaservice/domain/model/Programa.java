package com.edu.uceva.programaservice.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Programa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "El estado activo no puede ser nulo")
    @Column(nullable = false)
    private boolean activo;
    @NotNull(message = "La duracion no puede ser nula")
    @Min(value = 1, message = "La duracion debe ser de al menos 1 semestre")
    @Max(value = 10, message = "La duracion debe ser maxima de 10 semestres")
    @Column(nullable = false)
    private long duracion;
    @NotNull(message = "El ID del coordinador no puede ser nulo")
    @Positive(message = "El ID del coordinador debe ser un numero positivo")
    @Column(nullable = false)
    private long idCoordinador;
    @NotNull(message = "El ID de la facultas no puede ser nulo")
    @Positive(message = "El ID de la facultad debe ser un numero positivo")
    @Column(nullable = false)
    private long idFacultad;
}
