package Praktika2.task8;

public class Warrior extends Player{
    String armor;

    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }

    public void levelUp() {
        level += 1;
    }

    @Override
    public String getFullInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + armor;
    }

    @Override
    public boolean doDamage() {
        return true;
    }
}
