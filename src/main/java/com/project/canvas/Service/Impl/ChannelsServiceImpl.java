package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.Channels;
import com.project.canvas.Repository.ChannelsRepository;
import com.project.canvas.Service.ChannelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelsServiceImpl implements ChannelsService {

    @Autowired
    public ChannelsRepository channelsRepository;


    @Override
    public List<Channels> channelsListAll() {
        return channelsRepository.findAll();
    }

    @Override
    public Channels channelsSave(Channels channels) {
        return channelsRepository.save(channels);
    }

    @Override
    public Channels channelsGetById(Long id) {
        return channelsRepository.findById(id).get();
    }

    @Override
    public void channelsRemove(Long id) {
        channelsRepository.deleteById(id);
    }
}
