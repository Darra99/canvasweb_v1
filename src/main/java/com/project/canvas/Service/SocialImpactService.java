package com.project.canvas.Service;

import com.project.canvas.Entity.SocialImpact;

import java.util.List;

public interface SocialImpactService {

    public List<SocialImpact> socialImpactListAll();

    public SocialImpact socialImpactSave(SocialImpact socialImpact);

    public SocialImpact socialImpactGetById(Long id);

    public SocialImpact socialImpactUpdate(SocialImpact socialImpact);

    public void socialImpactRemove(Long id);


}
