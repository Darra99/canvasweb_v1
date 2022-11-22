package com.project.canvas.Repository;

import com.project.canvas.Entity.Breakeven;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreakevenRepository extends JpaRepository<Breakeven,Long> {
}
