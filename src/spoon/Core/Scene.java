package spoon.Core;

import spoon.Entities.GameObject;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Scene {
    private List<GameObject> gameObjects;

    public Scene(){
        this(new ArrayList<>());
    }

    public Scene(List<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
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

    public void render(Graphics g) {
        for (GameObject go : gameObjects) {
            go.render(g);
        }
    }
}
