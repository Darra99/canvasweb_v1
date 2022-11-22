package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.HowSolveProblem;
import com.project.canvas.Repository.HowSolveProblemRepository;
import com.project.canvas.Service.HowSolveProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HowSolveProblemServiceImpl implements HowSolveProblemService {

    @Autowired
    public HowSolveProblemRepository howSolveProblemRepository;


    @Override
    public List<HowSolveProblem> howSolveProblemListAll() {
        return howSolveProblemRepository.findAll();
    }

    @Override
    public HowSolveProblem howSolveProblemSave(HowSolveProblem howSolveProblem) {
        return howSolveProblemRepository.save(howSolveProblem);
    }

    @Override
    public HowSolveProblem howSolveProblemGetById(Long id) {
        return howSolveProblemRepository.findById(id).get();
    }

    @Override
    public HowSolveProblem howSolveProblemUpdate(HowSolveProblem howSolveProblem) {
        return howSolveProblemRepository.save(howSolveProblem);
    }

    @Override
    public void howSolveProblemRemove(Long id) {
        howSolveProblemRepository.deleteById(id);
    }
}
