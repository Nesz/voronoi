package dev.nesz.voronoi;

public interface DistanceAlgorithm {

    /**
     * Calculates the distance between two points
     *
     * @param first  - first point
     * @param second - second point
     * @return distance between two points
     */
    double distance(Point first, Point second);

}
