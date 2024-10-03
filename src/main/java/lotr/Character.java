package lotr;

public abstract class Character {
    private int hp;
    private int power;

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    // Setters
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public abstract void kick(Character c);

    public boolean isAlive(){
        return hp > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
