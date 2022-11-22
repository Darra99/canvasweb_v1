package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.Uvp;
import com.project.canvas.Repository.UvpRepository;
import com.project.canvas.Service.UvpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UvpServiceImpl implements UvpService {

    @Autowired
    public UvpRepository uvpRepository;


    @Override
    public List<Uvp> uvpListAll() {
        return uvpRepository.findAll();
    }

    @Override
    public Uvp uvpSave(Uvp uvp) {
        return uvpRepository.save(uvp);
    }

    @Override
    public Uvp uvpGetById(Long id) {
        return uvpRepository.findById(id).get();
    }

    @Override
    public Uvp uvpUpdate(Uvp uvp) {
        return uvpRepository.save(uvp);
    }

    @Override
    public void uvpRemove(Long id) {
        uvpRepository.deleteById(id);
    }
}
