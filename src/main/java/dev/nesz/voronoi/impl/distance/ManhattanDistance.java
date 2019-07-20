package dev.nesz.voronoi.impl.distance;

import dev.nesz.voronoi.DistanceAlgorithm;
import dev.nesz.voronoi.Point;

public class ManhattanDistance implements DistanceAlgorithm {

    @Override
    public double distance(Point first, Point second) {
        return Math.abs(first.getX() - second.getX()) + Math.abs(first.getY() - second.getY());
    }

}
