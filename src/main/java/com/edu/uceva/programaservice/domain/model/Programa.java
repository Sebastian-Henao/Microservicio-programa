package com.edu.uceva.programaservice.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
    @NotNull(message = "La descripcion del programa no puede ser nula")
    @Column(nullable = false)
    private String descripcion;
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
    @NotEmpty(message = "Debe ingresar el nivel académico del programa")
    @Pattern(
        regexp = "^(Tecnico|Tecnologico|Profesional|Especializacion|Maestria|Doctorado)$",
        message = "El nivel académico debe ser Tecnico, Tecnologico, Profesional, Especializacion, Maestria o Doctorado"
    )
    private String nivelAcademico;
    @NotBlank(message = "El nombre del programa no puede estar vacío")
    @NotNull(message = "El nombre del programa no puede ser nulo")
    private String nombre;
    @NotNull(message = "El número de créditos no puede ser nulo")
    @Min(value = 1, message = "El número de créditos debe ser al menos 1")
    private Byte numeroCreditos;
    @NotNull(message = "El perfil de egreso no puede ser nulo")
    @NotBlank(message = "El perfil de egreso no puede estar vacío")
    private String perfilEgreso;
}
