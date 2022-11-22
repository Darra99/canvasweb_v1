package com.project.canvas.Service;

import com.project.canvas.Entity.Segment;

import java.util.List;

public interface SegmentService {

    public List<Segment> segmentListAll();

    public Segment segmentSave(Segment segment);

    public Segment segmentGetById(Long id);

    public Segment segmentUpdate(Segment segment);

    public void segmentRemove(Long id);


}
