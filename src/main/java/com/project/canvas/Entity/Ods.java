package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

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


    public Ods() {
    }

    public Ods(String descripcionOds, String imgOds) {
        this.descripcionOds = descripcionOds;
        this.imgOds = imgOds;
    }

    public Ods(Long idOds, String descripcionOds, String imgOds) {
        this.idOds = idOds;
        this.descripcionOds = descripcionOds;
        this.imgOds = imgOds;
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
}
