package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "breakeven")
public class Breakeven {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_breakeven")
    private Long idBreakeven;


    @Column(name = "description_breakeven", nullable = false, unique = true)
    @NotEmpty
    private String descripcionBreakeven;


    public Breakeven() {

    }

    public Breakeven(String descripcionBreakeven) {
        this.descripcionBreakeven = descripcionBreakeven;
    }

    public Breakeven(Long idBreakeven, String descripcionBreakeven) {
        this.idBreakeven = idBreakeven;
        this.descripcionBreakeven = descripcionBreakeven;
    }

    public Long getIdBreakeven() {
        return idBreakeven;
    }

    public void setIdBreakeven(Long idBreakeven) {
        this.idBreakeven = idBreakeven;
    }

    public String getDescripcionBreakeven() {
        return descripcionBreakeven;
    }

    public void setDescripcionBreakeven(String descripcionBreakeven) {
        this.descripcionBreakeven = descripcionBreakeven;
    }
}
