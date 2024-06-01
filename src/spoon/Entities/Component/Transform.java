package spoon.Entities.Component;

public class Transform {
    private Position position;
    private Rotation rotation;
    private Scale scale;

    public Transform(){
        this(new Position(), new Rotation(), new Scale());
    }

    public Transform(Position position){
        this(position, new Rotation(), new Scale());
    }

    public Transform(Rotation rotation){
        this(new Position(), rotation, new Scale());
    }

    public Transform(Scale scale){
        this(new Position(), new Rotation(), scale);
    }

    public Transform(Position position, Rotation rotation){
        this(position, rotation, new Scale());
    }

    public Transform(Position position, Scale scale){
        this(position, new Rotation(), scale);
    }

    public Transform(Rotation rotation, Scale scale){
        this(new Position(), rotation, scale);
    }

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
