package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "income")
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_income")
    private Long idIncome;


    @Column(name = "description_income", nullable = false, unique = true)
    @NotEmpty
    private String descripcionIncome;


    public Income() {
    }

    public Income(String descripcionIncome) {
        this.descripcionIncome = descripcionIncome;
    }


    public Income(Long idIncome, String descripcionIncome) {
        this.idIncome = idIncome;
        this.descripcionIncome = descripcionIncome;
    }

    public Long getIdIncome() {
        return idIncome;
    }

    public void setIdIncome(Long idIncome) {
        this.idIncome = idIncome;
    }

    public String getDescripcionIncome() {
        return descripcionIncome;
    }

    public void setDescripcionIncome(String descripcionIncome) {
        this.descripcionIncome = descripcionIncome;
    }
}
