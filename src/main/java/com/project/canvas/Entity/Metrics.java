package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "metrics")
public class Metrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metrics")
    private Long idMetrics;


    @Column(name = "description_metrics", nullable = false, unique = true)
    @NotEmpty
    private String descripcionMetrics;


    public Metrics() {
    }

    public Metrics(String descripcionMetrics) {
        this.descripcionMetrics = descripcionMetrics;
    }

    public Metrics(Long idMetrics, String descripcionMetrics) {
        this.idMetrics = idMetrics;
        this.descripcionMetrics = descripcionMetrics;
    }

    public Long getIdMetrics() {
        return idMetrics;
    }

    public void setIdMetrics(Long idMetrics) {
        this.idMetrics = idMetrics;
    }

    public String getDescripcionMetrics() {
        return descripcionMetrics;
    }

    public void setDescripcionMetrics(String descripcionMetrics) {
        this.descripcionMetrics = descripcionMetrics;
    }
}
