package Builders;

import Models.CircleModel;
import spoon.Builders.DefaultModelBuilder;
import spoon.Builders.TransformBuilder;
import spoon.Entities.Component.Transform;

public class CircleModelBuilder extends DefaultModelBuilder {
    private int hp;

    public CircleModelBuilder setHp(int hp) {
        this.hp = hp;
        return this;
    }

    @Override
    public CircleModel createModel() {
        return new CircleModel(transform, hp);
    }
}