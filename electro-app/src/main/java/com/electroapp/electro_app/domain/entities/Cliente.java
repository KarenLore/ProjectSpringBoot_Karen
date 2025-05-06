package com.electroapp.electro_app.domain.entities;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tercero_id", nullable = false)
    private Terceros tercero;

    @Column(name = "FechaCompra", nullable = false)
    private LocalDate fechaCompra;

    @Column(name = "FechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;
}
