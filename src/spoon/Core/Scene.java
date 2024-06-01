package spoon.Core;

import spoon.Entities.GameObject;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Scene {
    private List<GameObject> gameObjects;
    private Color background;

    public Scene(){
        this(new ArrayList<>(), Color.white);
    }

    public Scene(List<GameObject> gameObjects){
        this(gameObjects, Color.white);
    }

    public Scene(Color background){
        this(new ArrayList<>(), background);
    }

    public Scene(List<GameObject> gameObjects, Color background) {
        this.gameObjects = gameObjects;
        this.background = background;
    }

    public List<GameObject> getGameObjects(){
        return this.gameObjects;
    }

    public void setGameObjects(List<GameObject> gameObjects){
        this.gameObjects = gameObjects;
    }

    public void addGameObject(GameObject gameObject){
        this.gameObjects.add(gameObject);
    }

    public Color getBackground() {
        return this.background;
    }

    public void setBackground(Color background){
        this.background = background;
    }

    public void render(Graphics g) {
        for (GameObject go : gameObjects) {
            go.render(g);
        }
    }
}
