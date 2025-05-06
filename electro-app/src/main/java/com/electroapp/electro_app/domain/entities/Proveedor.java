package com.electroapp.electro_app.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tercero_id", nullable = false)
    private Terceros tercero;

    @Column(name = "DiasPlazo", columnDefinition = "INTEGER")
    private int diasPlazo;

    @Column(name = "porcentajeProntoPago")
    private Double porcentaje;
}
