import spoon.Core.Game;
import spoon.Core.Scene;
import spoon.Entities.Component.Model;
import spoon.Entities.Component.Pivot;
import spoon.Entities.Component.View;
import spoon.Entities.GameObject;

public class Main {
    public static void main(String[] args) {
        View circleView = new View("Circle.png", Pivot.TOP_CENTER, 0.5, 0.5);
        Model circleModel = new Model(400,200);
        GameObject circle = new GameObject(circleView, circleModel);

        Scene firstScene = new Scene();
        firstScene.addGameObject(circle);

        Game TestGame = new Game("test");
        TestGame.addScene(firstScene);

        TestGame.run();
    }
}