package dev.nesz.voronoi.impl.distance;

import dev.nesz.voronoi.DistanceAlgorithm;
import dev.nesz.voronoi.Point;

public class EuclideanDistance implements DistanceAlgorithm {

    @Override
    public double distance(Point first, Point second) {
        return Math.sqrt((first.getX() - second.getX()) * (first.getX() - second.getX()) +
                         (first.getY() - second.getY()) * (first.getY() - second.getY()));
    }

}
