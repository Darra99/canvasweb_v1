package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.Ods;
import com.project.canvas.Repository.OdsRepository;
import com.project.canvas.Service.OdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdsServiceImpl implements OdsService {

    @Autowired
    private OdsRepository odsRepository;


    @Override
    public List<Ods> listAllOds() {
        return odsRepository.findAll();
    }
}
