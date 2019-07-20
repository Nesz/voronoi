import dev.nesz.voronoi.Voronoi;
import dev.nesz.voronoi.VoronoiDiagram;
import dev.nesz.voronoi.VoronoiPoint;
import dev.nesz.voronoi.impl.distance.ManhattanDistance;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Random random = new Random();
        List<VoronoiPoint> points = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            points.add(new VoronoiPoint(random.nextInt(1000), random.nextInt(1000)));
        }

        VoronoiDiagram diagram = Voronoi.builder()
                .setWidth(1000)
                .setHeight(1000)
                .drawPoints()
                .withPoints(points)
                .withDistanceAlgorithm(new ManhattanDistance())
                .build();

        BufferedImage g = diagram.generateDiagram();

        try {
            ImageIO.write(g, "png", new File("diagram.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}