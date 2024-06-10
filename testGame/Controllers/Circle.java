package Controllers;

import Models.CircleModel;
import Views.CircleView;
import spoon.Entities.Component.DefaultModel;
import spoon.Entities.Component.DefaultView;
import spoon.Entities.Component.Pivot;
import spoon.Entities.GameObject;

public class Circle extends GameObject {
    public Circle(CircleView circleView, CircleModel circleModel) {
        super(circleView, circleModel);
    }

    @Override
    public void Start() {

    }

    @Override
    public void Update() {

    }
}
