package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.SocialImpact;
import com.project.canvas.Repository.SocialImpactRepository;
import com.project.canvas.Service.SocialImpactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialImpactServiceImpl implements SocialImpactService {

    @Autowired
    public SocialImpactRepository socialImpactRepository;


    @Override
    public List<SocialImpact> socialImpactListAll() {
        return socialImpactRepository.findAll();
    }

    @Override
    public SocialImpact socialImpactSave(SocialImpact socialImpact) {
        return socialImpactRepository.save(socialImpact);
    }

    @Override
    public SocialImpact socialImpactGetById(Long id) {
        return socialImpactRepository.findById(id).get();
    }

    @Override
    public SocialImpact socialImpactUpdate(SocialImpact socialImpact) {
        return socialImpactRepository.save(socialImpact);
    }

    @Override
    public void socialImpactRemove(Long id) {
        socialImpactRepository.deleteById(id);
    }
}
