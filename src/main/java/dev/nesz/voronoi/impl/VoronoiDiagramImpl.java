package dev.nesz.voronoi.impl;

import dev.nesz.voronoi.*;
import dev.nesz.voronoi.Point;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.Collection;
import java.util.Set;

public class VoronoiDiagramImpl implements VoronoiDiagram {

    private int width;
    private int height;
    private boolean drawPoints;
    private Set<VoronoiPoint> points;
    private DistanceAlgorithm distanceAlgorithm;

    /**
     * Constructs a new {@link VoronoiDiagramImpl} instance.
     *
     * @param builder builder of the object
     */
    public VoronoiDiagramImpl(VoronoiDiagramBuilderImpl builder) {
        this.width = builder.width;
        this.height = builder.height;
        this.points = builder.points;
        this.drawPoints = builder.drawPoints;
        this.distanceAlgorithm = builder.distanceAlgorithm;

    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public boolean drawPoints() {
        return this.drawPoints;
    }

    @Override
    public Collection<VoronoiPoint> getPoints() {
        return this.points;
    }

    @Override
    public DistanceAlgorithm getDistanceAlgorithm() {
        return this.distanceAlgorithm;
    }

    @Override
    public VoronoiPoint findNearestPointTo(Point point) {
        VoronoiPoint nearest = points.iterator().next();

        for (VoronoiPoint voronoiPoint : points) {
            if (distanceAlgorithm.distance(new Point(voronoiPoint), point) <=
                distanceAlgorithm.distance(new Point(nearest), point)) {

                nearest = voronoiPoint;

            }
        }

        return nearest;
    }

    @Override
    public BufferedImage generateDiagram() {
        BufferedImage diagram = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                VoronoiPoint nearestPoint = findNearestPointTo(new Point(x, y));
                diagram.setRGB(x, y, nearestPoint.getRGB());
            }
        }

        if (drawPoints) {
            Graphics2D graphics2D = diagram.createGraphics();
            graphics2D.setColor(Color.BLACK);
            for (VoronoiPoint point : points) {
                graphics2D.fill(new Ellipse2D.Double(point.getX() - 2.5, point.getY() - 2.5, 5, 5));
            }
        }

        return diagram;
    }

}
