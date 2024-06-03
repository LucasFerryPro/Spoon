import spoon.Core.Game;
import spoon.Core.Scene;
import spoon.Entities.Component.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(
                new CircleView(Pivot.CENTER),
                new CircleModel(
                    new Transform(
                            new Position(400,300),
                            new Scale(0.5)
                    )
                )
        );

        Circle circle2 = new Circle(
                new CircleView(Pivot.CENTER),
                new CircleModel(
                        new Transform(
                                new Position(200,300),
                                new Scale(0.2)
                        ),
                        200
                )
        );

        System.out.println(((CircleModel)circle1.model).getHp());
        System.out.println(((CircleModel)circle2.model).getHp());

        Scene firstScene = new Scene(Color.LIGHT_GRAY);
        firstScene.addGameObject(circle1);
        firstScene.addGameObject(circle2);

        Game TestGame = new Game("test");
        TestGame.addScene(firstScene);

        TestGame.run();
    }
}