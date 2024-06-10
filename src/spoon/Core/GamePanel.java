package spoon.Core;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Scene scene;

    public GamePanel(Scene scene) {
        this.scene = scene;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(scene.getBackground());
        scene.render(g);
    }
}