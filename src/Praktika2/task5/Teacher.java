package Praktika2.task5;

public class Teacher extends People {
    String subject;

    @Override
    public void people(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    @Override
    public String getProfession() {
        return profession;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String giveALesson() {
        return "The lesson was ended";
    }
}
