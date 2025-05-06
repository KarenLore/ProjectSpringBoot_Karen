package com.electroapp.electro_app.domain.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tercero_id", nullable = false)
    private Terceros tercero;

    @ManyToOne
    @JoinColumn(name = "eps_id")
    @JsonBackReference
    private Eps epss;

    @ManyToOne
    @JoinColumn(name = "arl_id")
    @JsonBackReference
    private Arl arls;

    @Column(name = "FechaContratacion", nullable = false)
    private LocalDate fechaContratacion;

    @Column(name = "SalarioBase", nullable = false)
    private Double salario;

    @Column(name = "FechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;
}
