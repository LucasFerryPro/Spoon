import spoon.Entities.Component.DefaultModel;
import spoon.Entities.Component.Transform;

public class CircleModel extends DefaultModel {
    private int hp;
    public CircleModel(Transform transform, int hp) {
        super(transform);
        this.hp = hp;
    }

    public CircleModel(Transform transform){
        this(transform, 100);
    }

    public CircleModel(){
        super();
        this.hp = 100;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
