package spoon.Entities;

import spoon.Entities.Component.DefaultModel;
import spoon.Entities.Component.DefaultView;

import java.awt.*;

public abstract class GameObject{
    public DefaultView defaultView;
    public DefaultModel defaultModel;

    public GameObject(DefaultView defaultView, DefaultModel defaultModel) {
        this.defaultView = defaultView;
        this.defaultModel = defaultModel;
        defaultView.resizeImage(
                defaultModel.getTransform().getScale().getSizeW(),
                defaultModel.getTransform().getScale().getSizeH());
    }

    public void render(Graphics g) {
        defaultView.render(g,
                defaultModel.getTransform().getPosition().getX(),
                defaultModel.getTransform().getPosition().getY());
    }

    public abstract void Start();

    public abstract void Update();
}
