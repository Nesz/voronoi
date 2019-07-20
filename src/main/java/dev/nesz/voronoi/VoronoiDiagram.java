package dev.nesz.voronoi;

import java.awt.image.BufferedImage;
import java.util.Collection;

public interface VoronoiDiagram {

    /**
     * Returns the width of the diagram
     *
     * @return width of diagram
     */
    int getWidth();

    /**
     * Returns the height of the diagram
     *
     * @return height of diagram
     */
    int getHeight();

    /**
     * Checks if points should be drawn on the diagram
     *
     * @return the flag
     */
    boolean drawPoints();

    /**
     * Returns the collection of {@link dev.nesz.voronoi.VoronoiPoint}
     *
     * @return colection of points
     */
    Collection<VoronoiPoint> getPoints();

    /**
     * Returns the {@link DistanceAlgorithm}
     *
     * @return distance algorithm
     */
    DistanceAlgorithm getDistanceAlgorithm();

    /**
     * Returns the nearest point
     *
     * @param point - point from which search begins
     *
     * @return nearest point
     */
    VoronoiPoint findNearestPointTo(Point point);

    /**
     * Generates diagram
     *
     * @return the diagram
     */
    BufferedImage generateDiagram();

}