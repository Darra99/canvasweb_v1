package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ods")
public class Ods implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ods")
    private Long idOds;


    @Column(name = "description_ods", nullable = false, unique = true)
    @NotEmpty
    private String descripcionOds;

    @Column(name = "img_ods", nullable = false, unique = true)
    @NotEmpty
    private String imgOds;


    @OneToMany(mappedBy="ods", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
    private List<OdsSelect> odsSelects = new ArrayList<>();


    public Ods() {
    }

    public Ods(String descripcionOds, String imgOds, List<OdsSelect> odsSelects) {
        this.descripcionOds = descripcionOds;
        this.imgOds = imgOds;
        this.odsSelects = odsSelects;
    }

    public Ods(Long idOds, String descripcionOds, String imgOds, List<OdsSelect> odsSelects) {
        this.idOds = idOds;
        this.descripcionOds = descripcionOds;
        this.imgOds = imgOds;
        this.odsSelects = odsSelects;
    }

    public Long getIdOds() {
        return idOds;
    }

    public void setIdOds(Long idOds) {
        this.idOds = idOds;
    }

    public String getDescripcionOds() {
        return descripcionOds;
    }

    public void setDescripcionOds(String descripcionOds) {
        this.descripcionOds = descripcionOds;
    }

    public String getImgOds() {
        return imgOds;
    }

    public void setImgOds(String imgOds) {
        this.imgOds = imgOds;
    }

    public List<OdsSelect> getOdsSelects() {
        return odsSelects;
    }

    public void setOdsSelects(List<OdsSelect> odsSelects) {
        this.odsSelects = odsSelects;
    }
}
