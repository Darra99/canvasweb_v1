package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "unfair_advantage")
public class UnfairAdvantage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unfair_advantage")
    private Long idUnfairAdvantage;


    @Column(name = "description_unfair_advantage", nullable = false, unique = true)
    @NotEmpty
    private String descripcionUnfairAdvantage;


    public UnfairAdvantage() {
    }

    public UnfairAdvantage(String descripcionUnfairAdvantage) {
        this.descripcionUnfairAdvantage = descripcionUnfairAdvantage;
    }

    public UnfairAdvantage(Long idUnfairAdvantage, String descripcionUnfairAdvantage) {
        this.idUnfairAdvantage = idUnfairAdvantage;
        this.descripcionUnfairAdvantage = descripcionUnfairAdvantage;
    }

    public Long getIdUnfairAdvantage() {
        return idUnfairAdvantage;
    }

    public void setIdUnfairAdvantage(Long idUnfairAdvantage) {
        this.idUnfairAdvantage = idUnfairAdvantage;
    }

    public String getDescripcionUnfairAdvantage() {
        return descripcionUnfairAdvantage;
    }

    public void setDescripcionUnfairAdvantage(String descripcionUnfairAdvantage) {
        this.descripcionUnfairAdvantage = descripcionUnfairAdvantage;
    }
}
