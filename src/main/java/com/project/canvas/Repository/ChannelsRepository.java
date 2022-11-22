package com.project.canvas.Repository;

import com.project.canvas.Entity.Channels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelsRepository extends JpaRepository<Channels,Long> {

}
