package com.servicio_consultas.ms_consultas.dto;
import com.servicio_consultas.ms_consultas.model.DetalleConsulta;

import lombok.Data;

@Data
public class DetalleConsultaResponseDTO {
    private Long id;
    private Long consultaId;
    private String sintoma;
    private String tratamiento;
    private String indicaciones;

    public static DetalleConsultaResponseDTO fromEntity(DetalleConsulta detalle) {
        DetalleConsultaResponseDTO dto = new DetalleConsultaResponseDTO();
        dto.setId(detalle.getId());
        dto.setConsultaId(detalle.getConsultaId());
        dto.setSintoma(detalle.getSintoma());
        dto.setTratamiento(detalle.getTratamiento());
        dto.setIndicaciones(detalle.getIndicaciones());
        return dto;
    }
}
