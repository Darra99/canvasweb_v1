package com.project.canvas.Repository;

import com.project.canvas.Entity.Ods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdsRepository extends JpaRepository <Ods, Long> {
}
