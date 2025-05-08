package com.electroapp.electro_app.domain.entities;

import java.util.HashSet;
import java.util.Set;

import com.electroapp.electro_app.domain.entities.fkclass.TercerosId;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tercero")
public class Terceros {
    @EmbeddedId
    private TercerosId id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String apellido;

    @Column(length = 50, nullable = false)
    private int telefono;

    @Column(length = 100, nullable = false)
    private String direccion;

    @Column(length = 100, nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "cities_id")
    @JsonBackReference
    City cities;

    @OneToMany(mappedBy = "tercero", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Empleado> empleados = new HashSet<>();

    @OneToMany(mappedBy = "tercero", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Proveedor> proveedores = new HashSet<>();

    @OneToMany(mappedBy = "tercero", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Cliente> clientes = new HashSet<>();
}
