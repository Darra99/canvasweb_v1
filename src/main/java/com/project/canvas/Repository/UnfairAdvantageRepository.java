package com.project.canvas.Repository;

import com.project.canvas.Entity.UnfairAdvantage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnfairAdvantageRepository extends JpaRepository<UnfairAdvantage,Long> {
}
