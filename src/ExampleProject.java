public class ExampleProject {
    public static void main(String[] args) {

        String str = "Hi!";
        Cat cat1 = new Cat();
        System.out.printf("Вес кошки N1: %.2f %n", cat1.getWeight());
        cat1.feed(200.0);
        cat1.meow();
        System.out.printf("Вес кошки N1 после кормежки: %.2f %n", cat1.getWeight());

    }
    public static class Cat {

        private final double originWeight;
        private double weight;

        public Cat() {
            this(1500.0 + 3000.0 * Math.random());
        }

        public Cat(double weight) {
            this.weight = weight;
            this.originWeight = weight;
        }

        public void meow() {
            weight = weight - 1;
            System.out.println("Meow");
        }

        public void feed(Double amount) {
            weight = weight + amount;
        }

        public void drink(Double amount) {
            weight = weight + amount;
        }

        public void pee() {
            weight = weight - 10;
            System.out.println("Clean it, man!");
        }

        public double getWeight() {
            return weight;
        }
    }
}
