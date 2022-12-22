package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.OdsSave;
import com.project.canvas.Entity.OdsSelect;
import com.project.canvas.Repository.OdsSaveRepository;
import com.project.canvas.Service.OdsSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdsSaveServiceImpl implements OdsSaveService {

    @Autowired
    private OdsSaveRepository odsSaveRepository;


    @Override
    public List<OdsSave> listAllOdsSave() {
        return odsSaveRepository.findAll();
    }

    @Override
    public void saveOdsSave(OdsSave odsSave) {
        odsSaveRepository.save(odsSave);
    }

    @Override
    public OdsSave searchXId(Long id) {
        return odsSaveRepository.findById(id).get();
    }

    @Override
    public void eliminar(Long id) {
        odsSaveRepository.deleteById(id);
    }
}
