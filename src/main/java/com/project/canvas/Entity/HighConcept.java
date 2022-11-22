package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "high_concept")
public class HighConcept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_high_concept")
    private Long idHightConcept;


    @Column(name = "description_high_concept", nullable = false, unique = true)
    @NotEmpty
    private String descripcionHightConcept;


    public HighConcept() {
    }

    public HighConcept(String descripcionHightConcept) {
        this.descripcionHightConcept = descripcionHightConcept;
    }

    public HighConcept(Long idHightConcept, String descripcionHightConcept) {
        this.idHightConcept = idHightConcept;
        this.descripcionHightConcept = descripcionHightConcept;
    }

    public Long getIdHightConcept() {
        return idHightConcept;
    }

    public void setIdHightConcept(Long idHightConcept) {
        this.idHightConcept = idHightConcept;
    }

    public String getDescripcionHightConcept() {
        return descripcionHightConcept;
    }

    public void setDescripcionHightConcept(String descripcionHightConcept) {
        this.descripcionHightConcept = descripcionHightConcept;
    }
}
