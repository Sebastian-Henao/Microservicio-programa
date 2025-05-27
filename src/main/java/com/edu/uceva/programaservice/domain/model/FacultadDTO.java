package com.edu.uceva.programaservice.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FacultadDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message ="No puede estar vacio")
    @Size(min=2, message="El tamaño tiene que tener minimo 2 caracteres")
    @Column(nullable=false)
    private String nombre;

    @NotNull(message = "Debe ingresar el nombre de la facultad")
    @Column(nullable = false)
    private Long id_decano;
}
