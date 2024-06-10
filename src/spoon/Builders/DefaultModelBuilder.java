package spoon.Builders;

import spoon.Entities.Component.DefaultModel;
import spoon.Entities.Component.Transform;

public class DefaultModelBuilder {
    protected Transform transform = new TransformBuilder().createTransform();

    public DefaultModelBuilder setTransform(Transform transform) {
        this.transform = transform;
        return this;
    }

    public DefaultModel createModel() {
        return new DefaultModel(transform);
    }
}