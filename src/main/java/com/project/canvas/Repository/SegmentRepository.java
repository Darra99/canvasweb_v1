package com.project.canvas.Repository;

import com.project.canvas.Entity.Segment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SegmentRepository extends JpaRepository<Segment,Long> {
}
