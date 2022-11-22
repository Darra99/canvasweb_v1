package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "channels")
public class Channels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_channels")
    private Long idChannels;

    @Column(name = "description_channels", nullable = false, unique = true)
    @NotEmpty
    private String descriptionChannels;

    @ManyToOne
    @JoinColumn(name = "id_channels_type")
    private ChannelsType channelsType;


    public Channels() {
    }

    public Channels(Long idChannels, String descriptionChannels) {
        this.idChannels = idChannels;
        this.descriptionChannels = descriptionChannels;
    }

    public Channels(Long idChannels, String descriptionChannels, ChannelsType channelsType) {
        this.idChannels = idChannels;
        this.descriptionChannels = descriptionChannels;
        this.channelsType = channelsType;
    }

    public Long getIdChannels() {
        return idChannels;
    }

    public void setIdChannels(Long idChannels) {
        this.idChannels = idChannels;
    }

    public String getDescriptionChannels() {
        return descriptionChannels;
    }

    public void setDescriptionChannels(String descriptionChannels) {
        this.descriptionChannels = descriptionChannels;
    }

    public ChannelsType getChannelsType() {
        return channelsType;
    }

    public void setChannelsType(ChannelsType channelsType) {
        this.channelsType = channelsType;
    }
}
