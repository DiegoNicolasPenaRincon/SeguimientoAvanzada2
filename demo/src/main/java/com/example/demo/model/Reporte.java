package com.example.demo.model;

import com.example.demo.enums.EstadoReporte;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
public class Reporte {

    private String ID;
    private String titulo;
    private Set<String> categoriasConjutno;
    private String descripcion;
    private Ubicacion ubicacion;
    private List<String> imagenes;
    private int nivelImportancia;
    private int diasFaltantes;
    private EstadoReporte estadoReporte;
    private List<Informe> informesAsociados;
    private List<Comentario> listaComentarios;
}
