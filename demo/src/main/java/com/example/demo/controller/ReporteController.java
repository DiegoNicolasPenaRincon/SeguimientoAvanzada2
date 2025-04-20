package com.example.demo.controller;

import com.example.demo.dto.ReporteDTO;
import com.example.demo.dto.UsuarioDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reportes")
public class ReporteController {
    @PostMapping
    public ResponseEntity<ReporteDTO> crearReporte(@Valid @RequestBody ReporteDTO reporteDTO) {
        //Logica para crear usuario
        return ResponseEntity.status(HttpStatus.CREATED).body(reporteDTO);
    }
}
