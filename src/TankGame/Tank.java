package TankGame;

public class Tank {
    private int x, y;
    private int dir;
    private int fuel;
    private static int tankCount;
    private final String s = "T-34";

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    void goForward(int i) {
        if (i < 0 && -i > fuel) {
            i = -fuel;
        } else if (i > fuel) {
            i = fuel;
        }

        if (dir == 0) {
            x += i;
        } else if (dir == 1) {
            y += i;
        } else if (dir == 2) {
            x -= i;
        } else {
            y -= i;
        }
        fuel -= Math.abs(i);
    }

    void printPosition() {
        tankCount++;
        System.out.printf("The Tank %s-%d is at %d, %d, now.\n", s, tankCount, x, y);
    }
    void goBackward(int i) {
        goForward(-i);
    }
    void turnRight() {
        dir++;
        if (dir == -1) {
            dir = 3;
        }
    }
    void turnLeft() {
        dir--;
        if (dir == 4) {
            dir = 0;
        }
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public int getFuel() {
        return fuel;
    }
}