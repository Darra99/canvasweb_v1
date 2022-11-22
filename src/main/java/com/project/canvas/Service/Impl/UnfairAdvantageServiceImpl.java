package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.UnfairAdvantage;
import com.project.canvas.Repository.UnfairAdvantageRepository;
import com.project.canvas.Service.UnfairAdvantageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnfairAdvantageServiceImpl implements UnfairAdvantageService {

    @Autowired
    public UnfairAdvantageRepository unfairAdvantageRepository;


    @Override
    public List<UnfairAdvantage> unfairAdvantageListAll() {
        return unfairAdvantageRepository.findAll();
    }

    @Override
    public UnfairAdvantage unfairAdvantageSave(UnfairAdvantage unfairAdvantage) {
        return unfairAdvantageRepository.save(unfairAdvantage);
    }

    @Override
    public UnfairAdvantage unfairAdvantageGetById(Long id) {
        return unfairAdvantageRepository.findById(id).get();
    }

    @Override
    public UnfairAdvantage unfairAdvantageUpdate(UnfairAdvantage unfairAdvantage) {
        return unfairAdvantageRepository.save(unfairAdvantage);
    }

    @Override
    public void unfairAdvantageRemove(Long id) {
        unfairAdvantageRepository.deleteById(id);
    }
}
