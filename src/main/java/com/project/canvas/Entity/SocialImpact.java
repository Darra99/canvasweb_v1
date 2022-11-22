package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "social_impact")
public class SocialImpact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_social_impact")
    private Long idSocialImpact;


    @Column(name = "description_social_impact", nullable = false, unique = true)
    @NotEmpty
    private String descripcionSocialImpact;


    public SocialImpact() {
    }

    public SocialImpact(String descripcionSocialImpact) {
        this.descripcionSocialImpact = descripcionSocialImpact;
    }

    public SocialImpact(Long idSocialImpact, String descripcionSocialImpact) {
        this.idSocialImpact = idSocialImpact;
        this.descripcionSocialImpact = descripcionSocialImpact;
    }

    public Long getIdSocialImpact() {
        return idSocialImpact;
    }

    public void setIdSocialImpact(Long idSocialImpact) {
        this.idSocialImpact = idSocialImpact;
    }

    public String getDescripcionSocialImpact() {
        return descripcionSocialImpact;
    }

    public void setDescripcionSocialImpact(String descripcionSocialImpact) {
        this.descripcionSocialImpact = descripcionSocialImpact;
    }
}
