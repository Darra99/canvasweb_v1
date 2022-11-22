package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "how_solve_problem")
public class HowSolveProblem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_how_solve_problem")
    private Long idHowSolveProblem;


    @Column(name = "description_how_solve_problem", nullable = false, unique = true)
    @NotEmpty
    private String descripcionHowSolveProblem;


    public HowSolveProblem() {
    }


    public HowSolveProblem(String descripcionHowSolveProblem) {
        this.descripcionHowSolveProblem = descripcionHowSolveProblem;
    }

    public HowSolveProblem(Long idHowSolveProblem, String descripcionHowSolveProblem) {
        this.idHowSolveProblem = idHowSolveProblem;
        this.descripcionHowSolveProblem = descripcionHowSolveProblem;
    }

    public Long getIdHowSolveProblem() {
        return idHowSolveProblem;
    }

    public void setIdHowSolveProblem(Long idHowSolveProblem) {
        this.idHowSolveProblem = idHowSolveProblem;
    }

    public String getDescripcionHowSolveProblem() {
        return descripcionHowSolveProblem;
    }

    public void setDescripcionHowSolveProblem(String descripcionHowSolveProblem) {
        this.descripcionHowSolveProblem = descripcionHowSolveProblem;
    }
}
