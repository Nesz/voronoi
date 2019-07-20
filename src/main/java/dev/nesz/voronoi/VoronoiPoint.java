package dev.nesz.voronoi;

import java.awt.*;

public class VoronoiPoint {

    private final int x;
    private final int y;
    private final int rgb;

    /**
     * Constructs a new {@link VoronoiPoint} instance.
     *
     * @param x - horizontal position of the point
     * @param y - vertical position of the point
     * @param rgb - rgb representation of the point color
     */
    public VoronoiPoint(int x, int y, int rgb) {
        this.x = x;
        this.y = y;
        this.rgb = rgb;
    }

    /**
     * Constructs a new {@link VoronoiPoint} instance.
     *
     * @param x - horizontal position of the point
     * @param y  - vertical position of the point
     * @param color - color of the point
     */
    public VoronoiPoint(int x, int y, Color color) {
        this(x, y, color.getRGB());
    }

    /**
     * Constructs a new {@link VoronoiPoint} instance
     * with randomly generated color.
     *
     * @param x - horizontal position of the point
     * @param y  - vertical position of the point
     */
    public VoronoiPoint(final int x, final int y) {
        this(x, y, (int) (Math.random() * 0x1000000));
    }

    /**
     * Returns the horizontal position of the point
     *
     * @return nth horizontal pixel
     */
    public int getX() {
        return this.x;
    }

    /**
     * Returns the vertical position of the point
     *
     * @return nth vertical pixel
     */
    public int getY() {
        return this.y;
    }

    /**
     * Returns the RGB color value of the point
     *
     * @return rgb value
     */
    public int getRGB() {
        return this.rgb;
    }

    /**
     * Returns the color of the point
     *
     * @return color of the point
     */
    public Color getColor() {
        return new Color(this.rgb);
    }
}
