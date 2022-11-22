package com.project.canvas.Service;

import com.project.canvas.Entity.Channels;
import com.project.canvas.Entity.ChannelsType;
import com.project.canvas.Entity.HowSolveProblem;

import java.util.List;

public interface ChannelsService {

    public List<Channels> channelsListAll();

    public Channels channelsSave(Channels channels);

    public Channels channelsGetById(Long id);

    public void channelsRemove(Long id);


}
