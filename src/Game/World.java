package Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class World {
    private static BufferedReader br;
    private static Person hero = null;
    private static Battle battle = null;

    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        battle = new Battle();
        System.out.println(String.format("Create nickname: "));
        try {
            command(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void command(String string) throws IOException {
        if (hero == null) {
            hero = new Hero(
                    string, 100, 20, 20, 0, 0
            );
            System.out.println(String.format("Your character %s was created", hero.getName()));
            printNavigation();
        }
        switch (string) {
            case "1": {
                System.out.println("Trader isn't came yet");
                command(br.readLine());
            }
            break;
            case "2": {
                commitFight();
            }
            break;
            case "3":
                System.exit(1);
                break;
            case "Y":
                command("2");
                break;
            case "N": {
                printNavigation();
                command(br.readLine());
            }
        }
        command(br.readLine());
    }

    private static void printNavigation() {
        System.out.println("Chose path: ");
        System.out.println("1. Trader");
        System.out.println("2. Twilight forest");
        System.out.println("3. Exit");
    }

    private static void commitFight() {
        battle.fight(hero, createMonster(), new FightCallback() {
            @Override
            public void fightWin() {
                System.out.println(String.format("%s won! Got %d XP and %d gold, you got %d hp.", hero.getName(), hero.getXp(), hero.getGold(), hero.getHp()));
                System.out.println("Continue or return city? (Y/N)");
                try {
                    command(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void fightLost() {
            }
        });
    }

    interface FightCallback {
        void fightWin();
        void fightLost();
    }

    private static Person createMonster() {
        int random = (int) (Math.random() * 10);
        if (random % 2 == 0) return new Goblin(
                "Goblin",
                50,
                10,
                10,
                100,
                20
        );
        else return new Skeleton(
                "Skeleton",
                25,
                20,
                20,
                100,
                10
        );
    }
}
