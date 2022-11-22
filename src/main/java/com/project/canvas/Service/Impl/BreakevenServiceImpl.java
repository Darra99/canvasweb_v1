package com.project.canvas.Service.Impl;


import com.project.canvas.Entity.Breakeven;
import com.project.canvas.Repository.BreakevenRepository;
import com.project.canvas.Service.BreakevenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreakevenServiceImpl implements BreakevenService {

    @Autowired
    public BreakevenRepository breakevenRepository;


    @Override
    public List<Breakeven> breakevenListAll() {
        return breakevenRepository.findAll();
    }

    @Override
    public Breakeven breakevenSave(Breakeven breakeven) {
        return breakevenRepository.save(breakeven);
    }

    @Override
    public Breakeven breakevenGetById(Long id) {
        return breakevenRepository.findById(id).get();
    }

    @Override
    public Breakeven breakevenUpdate(Breakeven breakeven) {
        return breakevenRepository.save(breakeven);
    }

    @Override
    public void breakevenRemove(Long id) {
        breakevenRepository.deleteById(id);
    }
}
