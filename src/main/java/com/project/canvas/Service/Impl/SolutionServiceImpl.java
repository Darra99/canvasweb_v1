package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.Solution;
import com.project.canvas.Repository.SolutionRepository;
import com.project.canvas.Service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolutionServiceImpl implements SolutionService {

    @Autowired
    public SolutionRepository solutionRepository;


    @Override
    public List<Solution> solutionListAll() {
        return solutionRepository.findAll();
    }

    @Override
    public Solution solutionSave(Solution solution) {
        return solutionRepository.save(solution);
    }

    @Override
    public Solution solutionGetById(Long id) {
        return solutionRepository.findById(id).get();
    }

    @Override
    public Solution solutionUpdate(Solution solution) {
        return solutionRepository.save(solution);
    }

    @Override
    public void solutionRemove(Long id) {
        solutionRepository.deleteById(id);
    }
}
