package TankGame;

public class Main {

    public static void main(String[] args) {

        Tank justTank = new Tank();
        Tank anywareTank = new Tank(10, 10);
        Tank customTank = new Tank(20, 30, 200);
        Tank abramsTank = new Tank(10, 10, 300);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
        abramsTank.goForward(250);
        abramsTank.printPosition();
    }
}