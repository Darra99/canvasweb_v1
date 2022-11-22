package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "early_adopters")
public class EarlyAdopters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_early_adopters")
    private Long idEarlyAdopters;


    @Column(name = "description_early_adopters", nullable = false, unique = true)
    @NotEmpty
    private String descripcionEarlyAdopters;

    public EarlyAdopters() {
        this.idEarlyAdopters = idEarlyAdopters;
        this.descripcionEarlyAdopters = descripcionEarlyAdopters;
    }


    public EarlyAdopters(String descripcionEarlyAdopters) {
        this.descripcionEarlyAdopters = descripcionEarlyAdopters;
    }

    public EarlyAdopters(Long idEarlyAdopters, String descripcionEarlyAdopters) {
        this.idEarlyAdopters = idEarlyAdopters;
        this.descripcionEarlyAdopters = descripcionEarlyAdopters;
    }

    public Long getIdEarlyAdopters() {
        return idEarlyAdopters;
    }

    public void setIdEarlyAdopters(Long idEarlyAdopters) {
        this.idEarlyAdopters = idEarlyAdopters;
    }

    public String getDescripcionEarlyAdopters() {
        return descripcionEarlyAdopters;
    }

    public void setDescripcionEarlyAdopters(String descripcionEarlyAdopters) {
        this.descripcionEarlyAdopters = descripcionEarlyAdopters;
    }
}
