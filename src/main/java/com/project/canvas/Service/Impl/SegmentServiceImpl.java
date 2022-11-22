package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.Segment;
import com.project.canvas.Repository.SegmentRepository;
import com.project.canvas.Service.SegmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SegmentServiceImpl implements SegmentService {

    @Autowired
    public SegmentRepository segmentRepository;


    @Override
    public List<Segment> segmentListAll() {
        return segmentRepository.findAll();
    }

    @Override
    public Segment segmentSave(Segment segment) {
        return segmentRepository.save(segment);
    }

    @Override
    public Segment segmentGetById(Long id) {
        return segmentRepository.findById(id).get();
    }

    @Override
    public Segment segmentUpdate(Segment segment) {
        return segmentRepository.save(segment);
    }

    @Override
    public void segmentRemove(Long id) {
        segmentRepository.deleteById(id);
    }
}
