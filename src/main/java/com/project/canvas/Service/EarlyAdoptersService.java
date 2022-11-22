package com.project.canvas.Service;

import com.project.canvas.Entity.EarlyAdopters;

import java.util.List;

public interface EarlyAdoptersService {

    public List<EarlyAdopters> earlyAdoptersListAll();

    public EarlyAdopters earlyAdoptersSave(EarlyAdopters earlyAdopters);

    public EarlyAdopters earlyAdoptersGetById(Long id);

    public EarlyAdopters earlyAdoptersUpdate(EarlyAdopters earlyAdopters);

    public void earlyAdoptersRemove(Long id);


}
