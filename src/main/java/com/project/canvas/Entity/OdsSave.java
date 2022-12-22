package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "ods_save")
public class OdsSave implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ods_save")
    private Long idOdsSave;


    @ManyToOne
    @JoinColumn(name = "ods_id")
    private Ods ods;


    @ManyToOne
    @JoinColumn(name = "ods_select_id")
    private OdsSelect odsSelect;


    public OdsSave() {
    }

    public OdsSave(Ods ods, OdsSelect odsSelect) {
        this.ods = ods;
        this.odsSelect = odsSelect;
    }

    public OdsSave(Long idOdsSave, Ods ods, OdsSelect odsSelect) {
        this.idOdsSave = idOdsSave;
        this.ods = ods;
        this.odsSelect = odsSelect;
    }


    public Long getIdOdsSave() {
        return idOdsSave;
    }

    public void setIdOdsSave(Long idOdsDave) {
        this.idOdsSave = idOdsDave;
    }

    public Ods getOds() {
        return ods;
    }

    public void setOds(Ods ods) {
        this.ods = ods;
    }

    public OdsSelect getOdsSelect() {
        return odsSelect;
    }

    public void setOdsSelect(OdsSelect odsSelect) {
        this.odsSelect = odsSelect;
    }

}
