package com.project.canvas.Service;


import com.project.canvas.Entity.OdsSelect;

import java.util.List;

public interface OdsSelectService {

    public List <OdsSelect> listAllOdsSelect();

    public void saveOdsSelect(OdsSelect odsSelect);

    public OdsSelect searchXId(Long id);

    public void eliminar(Long id);
}
