package spoon.Entities.Component;

import spoon.Builders.TransformBuilder;

public class DefaultModel {
    protected final Transform transform;

    public DefaultModel(Transform transform){
        this.transform = transform;
    }

    public Transform getTransform(){
        return this.transform;
    }
}
