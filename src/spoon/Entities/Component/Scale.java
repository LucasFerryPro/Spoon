package spoon.Entities.Component;

public class Scale {
    private double sizeW;
    private double sizeH;

    public Scale(){
        this(1,1);
    }

    public Scale(double size){
        this(size, size);
    }

    public Scale(double sizeW, double sizeH){
        this.sizeW = sizeW;
        this.sizeH = sizeH;
    }

    public double getSizeW() {
        return this.sizeW;
    }

    public void setSizeW(double sizeW) {
        this.sizeW = sizeW;
    }

    public double getSizeH() {
        return this.sizeH;
    }

    public void setSizeH(double sizeH) {
        this.sizeH = sizeH;
    }
}
