package com.edu.uceva.programaservice.domain.services;

import com.edu.uceva.programaservice.domain.model.FacultadDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "Facultad-Service")
public interface IFacultadClient {
    @GetMapping("api/v1/facultad-service/facultads")
    Map<String, List<FacultadDTO>> idfacultad();
}
