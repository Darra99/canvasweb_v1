package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.ChannelsType;
import com.project.canvas.Repository.ChannelsTypeRepository;
import com.project.canvas.Service.ChannelsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelsTypeServiceImpl implements ChannelsTypeService {

    @Autowired
    public ChannelsTypeRepository channelsTypeRepository;


    @Override
    public List<ChannelsType> channelsTypeListAll() {
        return channelsTypeRepository.findAll();
    }
}
