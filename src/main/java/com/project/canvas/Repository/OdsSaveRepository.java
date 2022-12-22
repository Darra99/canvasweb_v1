package com.project.canvas.Repository;

import com.project.canvas.Entity.OdsSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdsSaveRepository extends JpaRepository<OdsSave, Long> {
}
