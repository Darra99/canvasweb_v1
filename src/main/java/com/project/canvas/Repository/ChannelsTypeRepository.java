package com.project.canvas.Repository;

import com.project.canvas.Entity.ChannelsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelsTypeRepository extends JpaRepository<ChannelsType,Long> {

}
