package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "solution")
public class Solution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solution")
    private Long idSolution;


    @Column(name = "description_solution", nullable = false, unique = true)
    @NotEmpty
    private String descripcionSolution;


    public Solution() {
    }

    public Solution(String descripcionSolution) {
        this.descripcionSolution = descripcionSolution;
    }

    public Solution(Long idSolution, String descripcionSolution) {
        this.idSolution = idSolution;
        this.descripcionSolution = descripcionSolution;
    }

    public Long getIdSolution() {
        return idSolution;
    }

    public void setIdSolution(Long idSolution) {
        this.idSolution = idSolution;
    }

    public String getDescripcionSolution() {
        return descripcionSolution;
    }

    public void setDescripcionSolution(String descripcionSolution) {
        this.descripcionSolution = descripcionSolution;
    }
}
