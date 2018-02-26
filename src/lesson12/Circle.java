package lesson12;

public class Circle extends Shape {
    private int radius = 5;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Рисую " + getColor() + "круг " + "с радиусом " + radius);
    }
}
