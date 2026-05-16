package com.servicio_consultas.ms_consultas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "citas")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleConsulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(name = "id_consulta", nullable = false)
    private Long consultaId;

    @NotBlank(message = "El sintoma no puede estar vacío")
    private String sintoma;

    @NotBlank(message = "El tratamiento no puede estar vacío")
    private String tratamiento;

    @NotBlank(message = "Las indicaciones no pueden estar vacías")
    private String indicaciones;

    @ManyToOne
    @JoinColumn(name = "id_consulta")
    private Consulta consulta;

}
