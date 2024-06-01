package spoon.Entities.Component;

public class Rotation {
    private double z;

    public Rotation(){
        this(0);
    }

    public Rotation(double z){
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
