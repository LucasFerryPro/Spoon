import spoon.Core.Game;
import spoon.Core.Scene;
import spoon.Entities.Component.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        DefaultView circleDefaultView = new DefaultView("Circle.png", Pivot.CENTER);
        DefaultModel circleDefaultModel = new DefaultModel(
                new Transform(
                        new Position(400,300),
                        new Scale(0.5)
                )
        );
        Circle circle = new Circle(circleDefaultView, circleDefaultModel);

        Scene firstScene = new Scene(Color.RED);
        firstScene.addGameObject(circle);

        Game TestGame = new Game("test");
        TestGame.addScene(firstScene);

        TestGame.run();
    }
}