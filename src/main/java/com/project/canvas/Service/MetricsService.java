package com.project.canvas.Service;

import com.project.canvas.Entity.Metrics;

import java.util.List;

public interface MetricsService {

    public List<Metrics> metricsListAll();

    public Metrics metricsSave(Metrics metrics);

    public Metrics metricsGetById(Long id);

    public Metrics metricsUpdate(Metrics metrics);

    public void metricsRemove(Long id);


}
