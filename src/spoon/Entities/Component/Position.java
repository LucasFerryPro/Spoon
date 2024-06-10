package spoon.Entities.Component;

public class Position {
    private int x;
    private int y;

    public Position(){
        this(0,0);
    }

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
