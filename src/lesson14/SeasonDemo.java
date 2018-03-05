package lesson14;

/**
 * Создать  переменную содержащую ваше любимое время.
 * Создать метод, который принимает на вход переменную созданного вами enum типа.
 * Если значение равно Лето, выводим на консоль “Я люблю лето” и т.д.
 * Используем оператор switch.
 * В цикле распечатать  все времена года. Используем метод values().
 * Создать  переменную содержащую ваше любимое время года с использованием метода valueOf().
 */
public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        printSeason(season);
        printSeason(Season.SUMMER);
        values();
        valueOf();
    }

    private static void valueOf() {
        Season season1 = Season.valueOf("SPRING");
        System.out.println(season1);
    }

    private static void values() {
        Season[] seas = Season.values();
        for (Season s : seas) {
            System.out.println(s);
        }
    }

    public static void printSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Люблю зиму");
                break;
            case SPRING:
                System.out.println("Люблю весну");
                break;
            case SUMMER:
                System.out.println("Люблю лето");
                break;
            case AUTUMN:
                System.out.println("Люблю осень");
                break;
        }
    }
}
