package spoon.Entities.Component;

public class DefaultModel {
    protected final Transform transform;

    public DefaultModel(){
        this(new Transform());
    }

    public DefaultModel(Transform transform){
        this.transform = transform;
    }

    public Transform getTransform(){
        return this.transform;
    }
}
