package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "costs")
public class Costs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_costs")
    private Long idCosts;


    @Column(name = "description_costs", nullable = false, unique = true)
    @NotEmpty
    private String descripcionCosts;


    public Costs() {
    }

    public Costs(String descripcionCosts) {
        this.descripcionCosts = descripcionCosts;
    }

    public Costs(Long idCosts, String descripcionCosts) {
        this.idCosts = idCosts;
        this.descripcionCosts = descripcionCosts;
    }

    public Long getIdCosts() {
        return idCosts;
    }

    public void setIdCosts(Long idCosts) {
        this.idCosts = idCosts;
    }

    public String getDescripcionCosts() {
        return descripcionCosts;
    }

    public void setDescripcionCosts(String descripcionCosts) {
        this.descripcionCosts = descripcionCosts;
    }
}
