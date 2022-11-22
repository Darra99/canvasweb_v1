package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.Costs;
import com.project.canvas.Repository.CostsRepository;
import com.project.canvas.Service.CostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostsServiceImpl implements CostsService {

    @Autowired
    public CostsRepository costsRepository;


    @Override
    public List<Costs> costsListAll() {
        return costsRepository.findAll();
    }

    @Override
    public Costs costsSave(Costs costs) {
        return costsRepository.save(costs);
    }

    @Override
    public Costs costsGetById(Long id) {
        return costsRepository.findById(id).get();
    }

    @Override
    public Costs costsUpdate(Costs costs) {
        return costsRepository.save(costs);
    }

    @Override
    public void costsRemove(Long id) {
        costsRepository.deleteById(id);
    }
}
