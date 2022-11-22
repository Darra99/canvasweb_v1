package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.EarlyAdopters;
import com.project.canvas.Repository.EarlyAdoptersRepository;
import com.project.canvas.Service.EarlyAdoptersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EarlyAdoptersServiceImpl implements EarlyAdoptersService {

    @Autowired
    public EarlyAdoptersRepository earlyAdoptersRepository;


    @Override
    public List<EarlyAdopters> earlyAdoptersListAll() {
        return earlyAdoptersRepository.findAll();
    }

    @Override
    public EarlyAdopters earlyAdoptersSave(EarlyAdopters earlyAdopters) {
        return earlyAdoptersRepository.save(earlyAdopters);
    }

    @Override
    public EarlyAdopters earlyAdoptersGetById(Long id) {
        return earlyAdoptersRepository.findById(id).get();
    }

    @Override
    public EarlyAdopters earlyAdoptersUpdate(EarlyAdopters earlyAdopters) {
        return earlyAdoptersRepository.save(earlyAdopters);
    }

    @Override
    public void earlyAdoptersRemove(Long id) {
        earlyAdoptersRepository.deleteById(id);
    }
}
