package com.project.canvas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "channels_type")
public class ChannelsType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_channels_type")
    private Long idChannelsType;


    @Column(name = "channels_type", nullable = false, unique = true)
    @NotEmpty
    private String channelsType;


    public ChannelsType() {
    }

    public ChannelsType(String channelsType) {
        this.channelsType = channelsType;
    }

    public ChannelsType(Long idChannelsType, String channelsType) {
        this.idChannelsType = idChannelsType;
        this.channelsType = channelsType;
    }

    public Long getIdChannelsType() {
        return idChannelsType;
    }

    public void setIdChannelsType(Long idChannelsType) {
        this.idChannelsType = idChannelsType;
    }

    public String getChannelsType() {
        return channelsType;
    }

    public void setChannelsType(String channelsType) {
        this.channelsType = channelsType;
    }
}
