package dev.nesz.voronoi;

public class Point {

    private final int x;
    private final int y;

    public Point(VoronoiPoint point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
