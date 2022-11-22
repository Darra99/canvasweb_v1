package com.project.canvas.Service;

import com.project.canvas.Entity.HowSolveProblem;

import java.util.List;

public interface HowSolveProblemService {

    public List<HowSolveProblem> howSolveProblemListAll();

    public HowSolveProblem howSolveProblemSave(HowSolveProblem howSolveProblem);

    public HowSolveProblem howSolveProblemGetById(Long id);

    public HowSolveProblem howSolveProblemUpdate(HowSolveProblem howSolveProblem);

    public void howSolveProblemRemove(Long id);


}
