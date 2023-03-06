package tasks;

//Код можно сократить в два раза
public class Human {
    String name, address, work;
    int age, weight;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 80;
    }
    public Human(String name, String address) {
        this.name = name;
        this.age = 30;
        this.weight = 80;
        this.address = address;
    }
    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.weight = 80;
        this.work = work;
    }
    public Human(int age, int weight, String address, String work) {
        this.name = "Ivan";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }
}