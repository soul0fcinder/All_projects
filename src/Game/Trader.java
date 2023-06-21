package Game;

public class Trader {

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    private int hp, gold;
    private String name;

    private Object HealPotion;

    Hero hero;

    private int price = 25;
}
