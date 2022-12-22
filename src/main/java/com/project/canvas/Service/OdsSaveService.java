package com.project.canvas.Service;

import com.project.canvas.Entity.OdsSave;
import com.project.canvas.Entity.OdsSelect;

import java.util.List;

public interface OdsSaveService {

    public List<OdsSave> listAllOdsSave();

    public void saveOdsSave(OdsSave odsSave);

    public OdsSave searchXId(Long id);

    public void eliminar(Long id);
}
