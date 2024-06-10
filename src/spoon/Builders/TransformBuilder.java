package spoon.Builders;

import spoon.Entities.Component.Position;
import spoon.Entities.Component.Rotation;
import spoon.Entities.Component.Scale;
import spoon.Entities.Component.Transform;

public class TransformBuilder {
    private Position position = new Position();
    private Rotation rotation = new Rotation();
    private Scale scale = new Scale();

    public TransformBuilder setPosition(Position position) {
        this.position = position;
        return this;
    }

    public TransformBuilder setRotation(Rotation rotation) {
        this.rotation = rotation;
        return this;
    }

    public TransformBuilder setScale(Scale scale) {
        this.scale = scale;
        return this;
    }

    public Transform createTransform() {
        return new Transform(position, rotation, scale);
    }
}