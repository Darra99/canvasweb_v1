package com.project.canvas.Repository;

import com.project.canvas.Entity.HowSolveProblem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HowSolveProblemRepository extends JpaRepository<HowSolveProblem,Long> {
}
