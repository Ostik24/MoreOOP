package lotr;

import java.util.Random;

public abstract class Noble extends Character {
    public Noble(int min, int max) {
        super(new Random().nextInt(min, max), new Random().nextInt(min, max));
    }

    @Override
    public void kick(Character c) {
        int damage = new Random().nextInt(getPower()) + 1;
        System.out.println(this.getClass().getSimpleName() + " deals " + damage + " damage to " + c.getClass().getSimpleName());
        c.setHp(c.getHp() - damage);
    }
}
