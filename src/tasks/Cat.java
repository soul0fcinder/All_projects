package tasks;

public class Cat extends Animal {
    public Cat(){
        super(true, "meat");
    }
    public void sound() {
        System.out.println("meow");
    }
}
