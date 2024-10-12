import Screen.*;
import Screen.Box;
import Screen.Renderer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("3d Renderer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 750);
        frame.setMinimumSize(new Dimension(400, 300));
        frame.setLocationRelativeTo(null);
        frame.setJMenuBar(new MainMenu());

//        Mesh cubeBleu = new Box(new Vertex(200, 200, 200), 100, 100, 30, Color.BLUE);
//        Mesh cubeRouge = new Box(new Vertex(0, 0, 0), 75, 75, 75, Color.RED);
//        Mesh ground = new Plane(new Vertex(0, 0, 0), 50, Color.white);
        Mesh teapot = new Mesh(new Vertex(0, 0, 0), Color.GRAY, "ressources/teapot.stl", 25);
        Mesh car = new Mesh(new Vertex(0, 0, 0), Color.ORANGE, "ressources/car.stl", 50);
        frame.add(new Renderer(new ArrayList<Mesh>(List.of(teapot,car))));
        frame.setVisible(true);

    }

}
