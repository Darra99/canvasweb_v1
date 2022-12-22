package com.project.canvas.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "ods_select")
public class OdsSelect implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idods_select")
    private Long idOdsSelect;


    @Column(name = "ods_select_description", nullable = false, unique = true)
    @NotEmpty
    private String descripcionOdsSelect;

    @ManyToOne
    @JoinColumn(name = "id_ods")
    @JsonIgnore
    private Ods ods;


    public OdsSelect() {
    }

    public OdsSelect(String descripcionOdsSelect, Ods ods) {
        this.descripcionOdsSelect = descripcionOdsSelect;
        this.ods = ods;
    }

    public OdsSelect(Long idOdsSelect, String descripcionOdsSelect, Ods ods) {
        this.idOdsSelect = idOdsSelect;
        this.descripcionOdsSelect = descripcionOdsSelect;
        this.ods = ods;
    }

    public Long getIdOdsSelect() {
        return idOdsSelect;
    }

    public void setIdOdsSelect(Long idOdsSelect) {
        this.idOdsSelect = idOdsSelect;
    }

    public String getDescripcionOdsSelect() {
        return descripcionOdsSelect;
    }

    public void setDescripcionOdsSelect(String descripcionOdsSelect) {
        this.descripcionOdsSelect = descripcionOdsSelect;
    }

    public Ods getOds() {
        return ods;
    }

    public void setOds(Ods ods) {
        this.ods = ods;
    }
}
