package lesson12;

/**
 * Создайте суперкласс Shape и его наследники Circle, Rectangle.
 * Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 * Классы Circle, Rectangle содержат координаты точек.
 * Создать массив содержащий эти фигуры.
 * В цикле нарисовать их (вызвать метод draw).
 */
public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract void draw();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {

        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        return color != null ? color.equals(shape.color) : shape.color == null;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }
}
