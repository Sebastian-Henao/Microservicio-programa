package com.edu.uceva.programaservice.domain.services;

import com.edu.uceva.programaservice.domain.model.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "usuario-service")
public interface IUsuarioClient {
    @GetMapping("/api/v1/usuario-service/usuarios/coordinadores")
    Map<String, List<UsuarioDTO>> idusuario();
}
