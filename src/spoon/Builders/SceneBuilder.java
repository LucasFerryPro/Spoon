package spoon.Builders;

import spoon.Core.Scene;
import spoon.Entities.GameObject;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SceneBuilder {
    private List<GameObject> gameObjects = new ArrayList<>();
    private Color background = Color.white;

    public SceneBuilder setGameObjects(List<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
        return this;
    }

    public SceneBuilder addGameObject(GameObject go) {
        this.gameObjects.add(go);
        return this;
    }

    public SceneBuilder setBackground(Color background) {
        this.background = background;
        return this;
    }

    public Scene createScene() {
        return new Scene(gameObjects, background);
    }
}