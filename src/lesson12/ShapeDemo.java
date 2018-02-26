package lesson12;

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("зеленый ", 9, 5);
        Circle circle = new Circle("красный ", 8);

        Shape shapeDemos[] = {rectangle, circle};
        for (Shape shape1 : shapeDemos) {
            shape1.draw();
        }
    }
}
