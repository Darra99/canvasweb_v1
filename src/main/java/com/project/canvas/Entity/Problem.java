package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "problem_opportunity")
public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_problem_opportunity")
    private Long idProblemOpportunity;


    @Column(name = "description_problem_opportunity", nullable = false, unique = true)
    @NotEmpty
    private String descripcionProblemOpportunity;


    public Problem() {
    }

    public Problem(String descripcionProblemOpportunity) {
        this.descripcionProblemOpportunity = descripcionProblemOpportunity;
    }

    public Problem(Long idProblemOpportunity, String descripcionProblemOpportunity) {
        this.idProblemOpportunity = idProblemOpportunity;
        this.descripcionProblemOpportunity = descripcionProblemOpportunity;
    }

    public Long getIdProblemOpportunity() {
        return idProblemOpportunity;
    }

    public void setIdProblemOpportunity(Long idProblemOpportunity) {
        this.idProblemOpportunity = idProblemOpportunity;
    }

    public String getDescripcionProblemOpportunity() {
        return descripcionProblemOpportunity;
    }

    public void setDescripcionProblemOpportunity(String descripcionProblemOpportunity) {
        this.descripcionProblemOpportunity = descripcionProblemOpportunity;
    }
}
