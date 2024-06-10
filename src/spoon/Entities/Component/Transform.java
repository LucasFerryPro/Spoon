package spoon.Entities.Component;

public class Transform {
    private Position position;
    private Rotation rotation;
    private Scale scale;

    public Transform(Position position, Rotation rotation, Scale scale){
        this.position = position;
        this.rotation = rotation;
        this.scale = scale;
    }

    public Position getPosition() {
        return this.position;
    }

    public Rotation getRotation() {
        return this.rotation;
    }

    public Scale getScale(){
        return this.scale;
    }
}
