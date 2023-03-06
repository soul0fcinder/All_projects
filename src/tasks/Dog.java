package tasks;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age += age;
    }

    void setName(String a) {
        this.name += a;
    }

    String getName() {
        return name;
    }

    void setAge(int a) {
        this.age += a;
    }

    int getAge() {
        return age;
    }

    String bark() {
        return "woof";
    }
}
