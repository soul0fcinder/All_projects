package Game;

import java.util.ArrayList;

public class Hero extends Person{
    private static int hp, agility, power, xp, gold, lvl;
    private String name;
    Hero hero;
    Trader trader;
    Backpack backpack;
    public int getGold() {
        return gold;
    }
    public static void setLvl(int lvl) {
        Hero.lvl = lvl;
    }
    public Hero(String name, int hp, int power, int agility, int xp, int gold) {
        super(name, hp, power, agility, xp, gold);
    }
    // Рюкзак для хранения
    class Backpack {
        private ArrayList<Object> items = new ArrayList<Object>();
        public void collect() {
            items.add("HealPotion");
        }
        public ArrayList<Object> getItems() {return items;}
    }
    // Покупка зелья
    public void buy() {
        if (hero.getGold() >= 25) {
            hero.setGold(this.gold - 25);
            trader.setGold(gold + 25);
            backpack.collect();
            System.out.println("Thanks for buying!");
        } else {System.out.println("Sorry but you ain't have enough money :( ");}
    }
    // Использование зелья
    public void use() {
        if (!backpack.getItems().isEmpty()) {
            hero.setHp(this.hp + 50);
            backpack.items.remove("HealPotion");
        } else {System.out.println("Your backpack is empty.");}
    }
    // Прокачка уровня
    public void lvlUp() {
        if (hero.getXp() >= 100) {hero.setLvl(lvl++);}
    }
}
