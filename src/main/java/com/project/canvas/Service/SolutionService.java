package com.project.canvas.Service;

import com.project.canvas.Entity.Solution;

import java.util.List;

public interface SolutionService {

    public List<Solution> solutionListAll();

    public Solution solutionSave(Solution solution);

    public Solution solutionGetById(Long id);

    public Solution solutionUpdate(Solution solution);

    public void solutionRemove(Long id);


}
