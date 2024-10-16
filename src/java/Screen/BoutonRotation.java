package Screen;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class BoutonRotation implements KeyListener, MouseListener {

    private final Renderer renderer;
    private Mesh selectedMesh;
    private int movementType = 0; //0-translation, 1-rotation

    public BoutonRotation(Renderer renderer) {
        this.renderer = renderer;
        this.selectedMesh = null;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                renderer.rotateWorld(Matrix.RIGHT_ROTATION);
                break;
            case KeyEvent.VK_LEFT:
                renderer.rotateWorld(Matrix.LEFT_ROTATION);
                break;
            case KeyEvent.VK_UP:
                renderer.rotateWorld(Matrix.UP_ROTATION);
                break;
            case KeyEvent.VK_DOWN:
                renderer.rotateWorld(Matrix.DOWN_ROTATION);
                break;
            case KeyEvent.VK_W:
                if (movementType == 0) {
                    renderer.translationMesh(selectedMesh, new Vertex(0, -3, 0));
                } else {
                    renderer.rotationMesh(selectedMesh, renderer.getVertexX(), -1);
                }
                break;
            case KeyEvent.VK_A:
                if (movementType == 0) {
                    renderer.translationMesh(selectedMesh, new Vertex(-3, 0, 0));
                } else {
                    renderer.rotationMesh(selectedMesh, renderer.getVertexZ(), 1);
                }
                break;
            case KeyEvent.VK_S:
                if (movementType == 0) {
                    renderer.translationMesh(selectedMesh, new Vertex(0, 3, 0));
                } else {
                    renderer.rotationMesh(selectedMesh, renderer.getVertexX(),1);
                }
                break;
            case KeyEvent.VK_D:
                if (movementType == 0) {
                    renderer.translationMesh(selectedMesh, new Vertex(3, 0, 0));
                } else {
                    renderer.rotationMesh(selectedMesh, renderer.getVertexZ(), -1);
                }
                break;
            case KeyEvent.VK_SPACE:
                if (movementType == 0) {
                    renderer.translationMesh(selectedMesh, new Vertex(0, 0, 3));
                }
                break;
            case KeyEvent.VK_SHIFT:
                if (movementType == 0) {
                    renderer.translationMesh(selectedMesh, new Vertex(0, 0, -3));
                }
                break;
            case KeyEvent.VK_1:
                if (movementType == 0) {
                    movementType = 1;
                } else {
                    movementType = 0;
                }
                break;
            case KeyEvent.VK_Q:
                if (movementType == 1) {
                    renderer.rotationMesh(selectedMesh, renderer.getVertexY(), 1);
                }
                break;
            case KeyEvent.VK_E:
                if (movementType == 1) {
                    renderer.rotationMesh(selectedMesh, renderer.getVertexY(), -1);
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void setSelectedMesh(Mesh selectedMesh) {
        this.selectedMesh = selectedMesh;
        if(selectedMesh != null) {}
        System.out.println(selectedMesh.getPosition());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        renderer.setMousePos(new Vertex(e.getX(), e.getY(), 1));
        renderer.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}


