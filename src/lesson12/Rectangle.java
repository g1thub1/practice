package lesson12;

public class Rectangle extends Shape {
    private int x;
    private int y;

    public Rectangle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw() {
        System.out.println("Рисую "+ getColor()+"прямоугольник "  + "с координатами " + x + " " + y);
    }
}
