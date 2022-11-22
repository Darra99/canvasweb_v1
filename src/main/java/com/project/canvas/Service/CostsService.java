package com.project.canvas.Service;

import com.project.canvas.Entity.Costs;

import java.util.List;

public interface CostsService {

    public List<Costs> costsListAll();

    public Costs costsSave(Costs costs);

    public Costs costsGetById(Long id);

    public Costs costsUpdate(Costs costs);

    public void costsRemove(Long id);


}
