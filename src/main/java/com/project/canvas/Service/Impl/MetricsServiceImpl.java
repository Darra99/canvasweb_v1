package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.Metrics;
import com.project.canvas.Repository.MetricsRepository;
import com.project.canvas.Service.MetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetricsServiceImpl implements MetricsService {

    @Autowired
    public MetricsRepository metricsRepository;


    @Override
    public List<Metrics> metricsListAll() {
        return metricsRepository.findAll();
    }

    @Override
    public Metrics metricsSave(Metrics metrics) {
        return metricsRepository.save(metrics);
    }

    @Override
    public Metrics metricsGetById(Long id) {
        return metricsRepository.findById(id).get();
    }

    @Override
    public Metrics metricsUpdate(Metrics metrics) {
        return metricsRepository.save(metrics);
    }

    @Override
    public void metricsRemove(Long id) {
        metricsRepository.deleteById(id);
    }
}
