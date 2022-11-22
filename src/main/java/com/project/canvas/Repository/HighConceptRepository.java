package com.project.canvas.Repository;

import com.project.canvas.Entity.HighConcept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HighConceptRepository extends JpaRepository<HighConcept,Long> {
}
