package jp.ac.uryukyu.ie.e175729;

import java.lang.reflect.Member;

public class Enemy extends LivingThing {


    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);


    }


    @Override
    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() < 0) {
            setDead(true);

            System.out.printf("モンスター%sは倒れた。", getName());
        }
    }
}

