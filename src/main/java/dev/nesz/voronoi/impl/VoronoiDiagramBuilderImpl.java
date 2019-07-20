package dev.nesz.voronoi.impl;

import dev.nesz.voronoi.DistanceAlgorithm;
import dev.nesz.voronoi.VoronoiDiagram;
import dev.nesz.voronoi.VoronoiDiagramBuilder;
import dev.nesz.voronoi.VoronoiPoint;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class VoronoiDiagramBuilderImpl implements
        VoronoiDiagramBuilder,
        VoronoiDiagramBuilder.HeightBuilder,
        VoronoiDiagramBuilder.PointsBuilder,
        VoronoiDiagramBuilder.DistanceBuilder,
        VoronoiDiagramBuilder.DrawPointsBuilder,
        VoronoiDiagramBuilder.FinalBuilder {

    int width;
    int height;
    boolean drawPoints;
    Set<VoronoiPoint> points;
    DistanceAlgorithm distanceAlgorithm;

    @Override
    public HeightBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    @Override
    public DrawPointsBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    @Override
    public PointsBuilder drawPoints() {
        this.drawPoints = true;
        return this;
    }

    @Override
    public PointsBuilder drawPoints(boolean draw) {
        this.drawPoints = draw;
        return this;
    }

    @Override
    public DistanceBuilder withPoints(Collection<VoronoiPoint> points) {
        this.points = new HashSet<>(points);
        return this;
    }

    @Override
    public FinalBuilder withDistanceAlgorithm(DistanceAlgorithm distanceAlgorithm) {
        this.distanceAlgorithm = distanceAlgorithm;
        return this;
    }

    @Override
    public VoronoiDiagram build() {
        return new VoronoiDiagramImpl(this);
    }
}
