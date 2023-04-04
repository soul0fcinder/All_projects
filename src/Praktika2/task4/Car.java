package Praktika2.task4;

public class Car {
    String carModel;

    public void carModel(String carModel) {
        this.carModel = carModel;
    }

    class Engine {
        boolean isWorking = false;
        int horsepower;

        public  void horsepower(int horsepower) {
            this.horsepower = horsepower;
        }

        public String startStopEngine() {
            if(isWorking = true) {
                this.isWorking = false;
                return "engine was stopped";
            }
            else {
                this.isWorking = true;
                return "engine was stopped";
            }
        }
    }
}