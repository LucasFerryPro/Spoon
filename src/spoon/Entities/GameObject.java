package spoon.Entities;

import spoon.Entities.Component.Model;
import spoon.Entities.Component.View;

import java.awt.*;

public class GameObject {
    public View view;
    public Model model;

    public GameObject(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void render(Graphics g) {
        view.render(g, model.getX(), model.getY());
    }
}
