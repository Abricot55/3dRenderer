package Screen;

import org.w3c.dom.ls.LSException;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Plane extends Mesh {

    /**
     * Contructor for a plane mesh
     *
     * @param postion - the position of the plane
     * @param scale   - the size of the plane
     * @param color   - the color of the plane
     */
    public Plane(Vertex postion, float scale, Color color) {
        super(postion, 1, color);
        this.scale = scale;
        generateShape();
    }

    /**
     * Creates the triangles of the cube
     */
    void generateShape() {
        List<Triangle> triangles;
        triangles =  new ArrayList<>(List.of(
                new Triangle(new Vertex(position.getX() - scale / 2, position.getY() - scale / 2, 0), new Vertex(position.getX() + scale / 2, position.getY() - scale / 2, 0), new Vertex(position.getX() - scale / 2, position.getY() + scale / 2, 0), new Vertex(0, 0, 100), this.color),
                new Triangle(new Vertex(position.getX() + scale / 2, position.getY() + scale / 2, 0), new Vertex(position.getX() - scale / 2, position.getY() + scale / 2, 0), new Vertex(position.getX() + scale / 2, position.getY() - scale / 2, 0), new Vertex(0, 0, 100), this.color)
        ));
        setTrianglesList(triangles);
    }
}

