package com.edu.uceva.programaservice.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FacultadDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "La Facultad Debe Estar Vinculada A Un Decano")
    @Column(nullable = false)
    private Long idDecano;

    @NotBlank(message = "La Facultad Debe Tener Un Nombre")
    @Column(nullable = false)
    private String nombre;
}
