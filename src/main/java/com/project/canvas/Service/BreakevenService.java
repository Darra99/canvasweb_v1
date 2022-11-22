package com.project.canvas.Service;

import com.project.canvas.Entity.Breakeven;

import java.util.List;

public interface BreakevenService {

    public List<Breakeven> breakevenListAll();

    public Breakeven breakevenSave(Breakeven breakeven);

    public Breakeven breakevenGetById(Long id);

    public Breakeven breakevenUpdate(Breakeven breakeven);

    public void breakevenRemove(Long id);


}
