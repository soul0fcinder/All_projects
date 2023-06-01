package Praktika2.task5;

public abstract class People {
    String name;
    int age;
    String profession;

    public void people(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public abstract String getProfession();
    public abstract int getAge();
    public abstract String getName();
}
