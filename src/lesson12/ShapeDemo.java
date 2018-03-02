package lesson12;

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("зеленый ", 9, 5);
        Circle circle = new Circle("красный ", 8);

        Rectangle rectangle1 = new Rectangle("черный ", 15, 7);
        Rectangle rectangle2 = new Rectangle("черный ", 15, 7);

        Circle circle1 = new Circle("желтый ", 4);
        Circle circle2 = new Circle("синий ", 9);

        Shape shapeDemos[] = {rectangle, circle};
        for (Shape shape1 : shapeDemos) {
            shape1.draw();
        }

        System.out.println("\n" + "Circle " + circle1.equals(circle2));
        System.out.println("Rectangle " + rectangle1.equals(rectangle2));

        System.out.println("\n" + rectangle);
        System.out.println(circle);
    }
}
