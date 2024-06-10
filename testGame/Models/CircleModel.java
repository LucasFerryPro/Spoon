package Models;

import spoon.Entities.Component.DefaultModel;
import spoon.Entities.Component.Transform;

public class CircleModel extends DefaultModel {

    private int hp;

    public CircleModel(Transform transform, int hp) {
        super(transform);
        this.hp = hp;
    }

    public int getHp(){
        return this.hp;
    }
}
