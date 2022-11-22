package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.OdsSelect;
import com.project.canvas.Repository.OdsSelectRepository;
import com.project.canvas.Service.OdsSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdsSelectServiceImpl implements OdsSelectService {

    @Autowired
    private OdsSelectRepository odsSelectRepository;


    @Override
    public List<OdsSelect> listAllOdsSelect() {
        return odsSelectRepository.findAll();
    }

    @Override
    public void saveOdsSelect(OdsSelect odsSelect) {
        odsSelectRepository.save(odsSelect);
    }

    @Override
    public OdsSelect searchXId(Long id) {
        return odsSelectRepository.findById(id).get();
    }

    @Override
    public void eliminar(Long id) {
        odsSelectRepository.deleteById(id);
    }
}
