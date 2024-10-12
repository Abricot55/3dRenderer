package Screen;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Creates a mesh in the shape of a box.
 * @author Sébastien Dubé
 * @version 1.0
 * @since 2024-09-08
 */
public class Box extends Mesh {

    double width;
    double length;
    double height;

    /**
     * Constructor for a Box object
     *
     * @param position - the position of the box in the scene
     * @param width    = the width of the box
     * @param length   = the length of the box
     * @param height   = the height of the box
     * @param color    - the color of the box
     */
    public Box(Vertex position, double width, double length, double height, Color color) {
        super(position, 1, color);
        this.width = width;
        this.length = length;
        this.height = height;
        generateShape(width, length, height, color);
    }

    /**
     * Creates the triangles of the box
     */
    public void generateShape(double width, double length, double height, Color color) {
        List<Triangle> triangles;
        triangles = new ArrayList<>(List.of(
                new Triangle(new Vertex(0 + position.getX(), 0 + position.getY(), 0 + position.getZ()), new Vertex(0 + position.getX(), length + position.getY(), height + position.getZ()), new Vertex(0 + position.getX(), length + position.getY(), 0 + position.getZ()), new Vertex(-100, 0, 0), this.color),
                new Triangle(new Vertex(0 + position.getX(), 0 + position.getY(), 0 + position.getZ()), new Vertex(0 + position.getX(), 0 + position.getY(), height + position.getZ()), new Vertex(0 + position.getX(), length + position.getY(), height + position.getZ()), new Vertex(-100, 0, 0), this.color),
                new Triangle(new Vertex(0 + position.getX(), 0 + position.getY(), 0 + position.getZ()), new Vertex(width + position.getX(), 0 + position.getY(), 0 + position.getZ()), new Vertex(width + position.getX(), 0 + position.getY(), height + position.getZ()), new Vertex(0, -100, 0), this.color),
                new Triangle(new Vertex(0 + position.getX(), 0 + position.getY(), 0 + position.getZ()), new Vertex(width + position.getX(), 0 + position.getY(), height + position.getZ()), new Vertex(0 + position.getX(), 0 + position.getY(), height + position.getZ()), new Vertex(0, -100, 0), this.color),
                new Triangle(new Vertex(0 + position.getX(), 0 + position.getY(), 0 + position.getZ()), new Vertex(width + position.getX(), length + position.getY(), 0 + position.getZ()), new Vertex(0 + position.getX(), length + position.getY(), 0 + position.getZ()), new Vertex(0, 0, -100), this.color),
                new Triangle(new Vertex(0 + position.getX(), 0 + position.getY(), 0 + position.getZ()), new Vertex(width + position.getX(), 0 + position.getY(), 0 + position.getZ()), new Vertex(width + position.getX(), length + position.getY(), 0 + position.getZ()), new Vertex(0, 0, -100), this.color),
                new Triangle(new Vertex(width + position.getX(), length + position.getY(), height + position.getZ()), new Vertex(width + position.getX(), 0 + position.getY(), 0 + position.getZ()), new Vertex(width + position.getX(), 0 + position.getY(), height + position.getZ()), new Vertex(100, 0, 0), this.color),
                new Triangle(new Vertex(width + position.getX(), length + position.getY(), height + position.getZ()), new Vertex(width + position.getX(), length + position.getY(), 0 + position.getZ()), new Vertex(width + position.getX(), 0 + position.getY(), 0 + position.getZ()), new Vertex(100, 0, 0), this.color),
                new Triangle(new Vertex(width + position.getX(), length + position.getY(), height + position.getZ()), new Vertex(0 + position.getX(), 0 + position.getY(), height + position.getZ()), new Vertex(width + position.getX(), 0 + position.getY(), height + position.getZ()), new Vertex(0, 0, 100), this.color),
                new Triangle(new Vertex(width + position.getX(), length + position.getY(), height + position.getZ()), new Vertex(0 + position.getX(), length + position.getY(), height + position.getZ()), new Vertex(0 + position.getX(), 0 + position.getY(), height + position.getZ()), new Vertex(0, 0, 100), this.color),
                new Triangle(new Vertex(width + position.getX(), length + position.getY(), height + position.getZ()), new Vertex(width + position.getX(), length + position.getY(), 0 + position.getZ()), new Vertex(0 + position.getX(), length + position.getY(), 0 + position.getZ()), new Vertex(0, 100, 0), this.color),
                new Triangle(new Vertex(width + position.getX(), length + position.getY(), height + position.getZ()), new Vertex(0 + position.getX(), length + position.getY(), 0 + position.getZ()), new Vertex(0 + position.getX(), length + position.getY(), height + position.getZ()), new Vertex(0, 100, 0), this.color)
        ));

        setTrianglesList(triangles);
    }

}
