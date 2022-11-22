package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.Problem;
import com.project.canvas.Repository.ProblemRepository;
import com.project.canvas.Service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {

    @Autowired
    public ProblemRepository problemRepository;


    @Override
    public List<Problem> problemListAll() {
        return problemRepository.findAll();
    }

    @Override
    public Problem problemSave(Problem problem) {
        return problemRepository.save(problem);
    }

    @Override
    public Problem problemGetById(Long id) {
        return problemRepository.findById(id).get();
    }

    @Override
    public Problem problemUpdate(Problem problem) {
        return problemRepository.save(problem);
    }

    @Override
    public void problemRemove(Long id) {
        problemRepository.deleteById(id);
    }
}
