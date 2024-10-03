package lotr;

import java.util.Random;

public abstract class Noble extends Character {
    public Noble(int min, int max) {
        super(min + new Random().nextInt(max - min + 1), min + new Random().nextInt(max - min + 1));
    }
    
    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(getPower() + 1));
    }
}