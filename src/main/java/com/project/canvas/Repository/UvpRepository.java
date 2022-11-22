package com.project.canvas.Repository;

import com.project.canvas.Entity.Uvp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UvpRepository extends JpaRepository<Uvp,Long> {
}
