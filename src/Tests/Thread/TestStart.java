package Tests.Thread;

class TestStart extends Thread {
    int i;

    public TestStart(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.print(i + ", ");
    }
}

class Main {

    //What does this code output?

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new TestStart(i).start();
        }
    }
}
