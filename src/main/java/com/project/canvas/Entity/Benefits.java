package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "benefits")
public class Benefits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_benefits")
    private Long idBenefits;


    @Column(name = "description_benefits", nullable = false, unique = true)
    @NotEmpty
    private String descripcionBenefits;


    public Benefits() {

    }

    public Benefits(String descripcionBenefits) {
        this.descripcionBenefits = descripcionBenefits;
    }

    public Benefits(Long idBenefits, String descripcionBenefits) {
        this.idBenefits = idBenefits;
        this.descripcionBenefits = descripcionBenefits;
    }

    public Long getIdBenefits() {
        return idBenefits;
    }

    public void setIdBenefits(Long idBenefits) {
        this.idBenefits = idBenefits;
    }

    public String getDescripcionBenefits() {
        return descripcionBenefits;
    }

    public void setDescripcionBenefits(String descripcionBenefits) {
        this.descripcionBenefits = descripcionBenefits;
    }
}
