package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "uvp")
public class Uvp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_uvp")
    private Long idUvp;


    @Column(name = "description_uvp", nullable = false, unique = true)
    @NotEmpty
    private String descripcionUvp;


    public Uvp() {
    }


    public Uvp(String descripcionUvp) {
        this.descripcionUvp = descripcionUvp;
    }


    public Uvp(Long idUvp, String descripcionUvp) {
        this.idUvp = idUvp;
        this.descripcionUvp = descripcionUvp;
    }

    public Long getIdUvp() {
        return idUvp;
    }

    public void setIdUvp(Long idUvp) {
        this.idUvp = idUvp;
    }

    public String getDescripcionUvp() {
        return descripcionUvp;
    }

    public void setDescripcionUvp(String descripcionUvp) {
        this.descripcionUvp = descripcionUvp;
    }
}
