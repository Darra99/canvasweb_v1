package com.project.canvas.Repository;

import com.project.canvas.Entity.SocialImpact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialImpactRepository extends JpaRepository<SocialImpact,Long> {
}
