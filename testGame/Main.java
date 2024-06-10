import Builders.CircleModelBuilder;
import Controllers.Circle;
import Models.CircleModel;
import Views.CircleView;
import spoon.Builders.GameBuilder;
import spoon.Builders.SceneBuilder;
import spoon.Builders.TransformBuilder;
import spoon.Core.Game;
import spoon.Core.Scene;
import spoon.Entities.Component.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(
                new CircleView(Pivot.BOTTOM_CENTER),
                (CircleModel) new CircleModelBuilder()
                        .setHp(200)
                        .setTransform(new TransformBuilder()
                                .setPosition(new Position(300, 500))
                                .setScale(new Scale(0.5))
                                .createTransform()
                        )
                        .createModel()
        );


        Scene firstScene = new SceneBuilder()
                .setBackground(Color.LIGHT_GRAY)
                .addGameObject(circle)
                .createScene();

        Game testGame = new GameBuilder()
                .setName("test")
                .setResizable(false)
                .addScene(firstScene)
                .createGame();

        testGame.run();
    }
}