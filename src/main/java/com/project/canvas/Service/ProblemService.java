package com.project.canvas.Service;

import com.project.canvas.Entity.Problem;

import java.util.List;

public interface ProblemService {

    public List<Problem> problemListAll();

    public Problem problemSave(Problem problem);

    public Problem problemGetById(Long id);

    public Problem problemUpdate(Problem problem);

    public void problemRemove(Long id);


}
