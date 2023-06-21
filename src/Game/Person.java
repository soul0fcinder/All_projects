package Game;

import static java.lang.Math.pow;
import static java.lang.Math.random;

public abstract class Person {
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getAgility() {
        return agility;
    }
    public int getPower() {
        return power;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }
    private int hp, agility, power, xp, gold;
    private String name;

    public Person(String name, int hp, int power, int agility, int xp, int gold) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.agility = agility;
        this.xp = xp;
        this.gold = gold;
    }

    // Реализация атаки
    public int attack() {
        if (agility * 3 > getRandomValue()) return power;
        else return 0;
    }
}
