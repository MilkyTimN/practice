package models;

public abstract class Gun {

    private int bullets;
    private int damage;

    public Gun(int bullets, int damage) {
        this.bullets = bullets;
        this.damage = damage;
    }

    public Gun() {
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void makeDamage() {

    }
    public abstract void makeBullets();
}
