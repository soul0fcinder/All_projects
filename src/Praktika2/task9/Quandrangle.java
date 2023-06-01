package Praktika2.task9;

public abstract class Quandrangle {
    int a, b;
    String color;

    public Quandrangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public abstract double getLargeDiagonal();
    public abstract double getHeight();
    public abstract String getColor();
}
