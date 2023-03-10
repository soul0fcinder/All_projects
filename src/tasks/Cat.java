package tasks;

public class Cat extends Animal {
    public Cat(){
        super(false, "meat");
    }
    public void sound() {
        System.out.println("meow");
    }
}
