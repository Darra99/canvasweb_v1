package com.project.canvas.Repository;

import com.project.canvas.Entity.EarlyAdopters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EarlyAdoptersRepository extends JpaRepository<EarlyAdopters,Long> {
}
