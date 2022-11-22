package com.project.canvas.Service;

import com.project.canvas.Entity.Uvp;

import java.util.List;

public interface UvpService {

    public List<Uvp> uvpListAll();

    public Uvp uvpSave(Uvp uvp);

    public Uvp uvpGetById(Long id);

    public Uvp uvpUpdate(Uvp uvp);

    public void uvpRemove(Long id);


}
