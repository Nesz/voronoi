package dev.nesz.voronoi.impl.distance;

import dev.nesz.voronoi.DistanceAlgorithm;
import dev.nesz.voronoi.Point;

public class MinkowskiDistance implements DistanceAlgorithm {

    @Override
    public double distance(Point first, Point second) {
        float p = 2.0f;
        return Math.pow(Math.pow(Math.abs(first.getX() - second.getX()), p) +
               Math.pow(Math.abs(first.getY() - second.getY()), p), (1 / p));
    }
}
