package dev.nesz.voronoi;

import java.util.Collection;

public interface VoronoiDiagramBuilder {

    HeightBuilder setWidth(int width);

    interface HeightBuilder {
        DrawPointsBuilder setHeight(int height);
    }

    interface DrawPointsBuilder {
        PointsBuilder drawPoints();
        PointsBuilder drawPoints(boolean draw);
    }

    interface PointsBuilder {
        DistanceBuilder withPoints(Collection<VoronoiPoint> points);
    }

    interface DistanceBuilder {
        FinalBuilder withDistanceAlgorithm(DistanceAlgorithm distanceAlgorithm);
    }

    interface FinalBuilder {
        VoronoiDiagram build();
    }

}