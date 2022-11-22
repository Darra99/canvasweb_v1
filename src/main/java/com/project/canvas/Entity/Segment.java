package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "segment")
public class Segment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_segment")
    private Long idSegment;


    @Column(name = "description_segment", nullable = false, unique = true)
    @NotEmpty
    private String descripcionSegment;


    public Segment() {
    }

    public Segment(String descripcionSegment) {
        this.descripcionSegment = descripcionSegment;
    }

    public Segment(Long idSegment, String descripcionSegment) {
        this.idSegment = idSegment;
        this.descripcionSegment = descripcionSegment;
    }

    public Long getIdSegment() {
        return idSegment;
    }

    public void setIdSegment(Long idSegment) {
        this.idSegment = idSegment;
    }

    public String getDescripcionSegment() {
        return descripcionSegment;
    }

    public void setDescripcionSegment(String descripcionSegment) {
        this.descripcionSegment = descripcionSegment;
    }
}
