# Voronoi

[![Build Status](https://travis-ci.org/Nesz/Voronoi.svg?branch=master)](https://travis-ci.org/Nesz/Voronoi)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Simple program to create voronoi diagrams

example
```java
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
```

output
![diagram](https://i.imgur.com/Gq88sbW.png)
