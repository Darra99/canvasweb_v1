package com.project.canvas.Repository;

import com.project.canvas.Entity.OdsSelect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdsSelectRepository extends JpaRepository<OdsSelect, Long> {
}
