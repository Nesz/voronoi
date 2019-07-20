package dev.nesz.voronoi;

import dev.nesz.voronoi.impl.VoronoiDiagramBuilderImpl;

public class Voronoi {

    public static VoronoiDiagramBuilder builder() {
        return new VoronoiDiagramBuilderImpl();
    }

}
