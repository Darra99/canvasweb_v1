package com.project.canvas.Repository;

import com.project.canvas.Entity.Benefits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitsRepository extends JpaRepository<Benefits,Long> {
}
