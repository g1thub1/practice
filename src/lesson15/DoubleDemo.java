package lesson15;

/**
 * Создайте объекты класса Double, используя все имеющиеся конструкторы.
 * Создайте объекты класса Double, используя методы valueOf().
 * Преобразовать значение типа String к типу double.
 * Используем метод Double.parseDouble().
 */
public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = new Double((double) 2.5);
        Double double2 = new Double("2.55");
        System.out.println(double1);
        System.out.println(double2);

        doubleValueOf();
        parseDouble();
    }

    private static void parseDouble() {
        Double.parseDouble("14.44");
        double double5 = Double.parseDouble("15.55");
        System.out.println(double5);
    }

    private static void doubleValueOf() {
        Double double3 = Double.valueOf(4.5);
        Double double4 = Double.valueOf("4.55");

        System.out.println(double3);
        System.out.println(double4);
    }
}
