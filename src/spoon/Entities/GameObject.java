package spoon.Entities;

import spoon.Entities.Component.DefaultModel;
import spoon.Entities.Component.DefaultView;

import java.awt.*;

public abstract class GameObject{
    public DefaultView view;
    public DefaultModel model;

    public GameObject(DefaultView view, DefaultModel model) {
        this.view = view;
        this.model = model;
        view.resizeImage(
                model.getTransform().getScale().getSizeW(),
                model.getTransform().getScale().getSizeH());
    }

    public void render(Graphics g) {
        view.render(g,
                model.getTransform().getPosition().getX(),
                model.getTransform().getPosition().getY());
    }

    public abstract void Start();

    public abstract void Update();
}
