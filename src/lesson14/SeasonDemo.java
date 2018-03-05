package lesson14;

/**
 * Создать  переменную содержащую ваше любимое время.
 * Создать метод, который принимает на вход переменную созданного вами enum типа.
 * Если значение равно Лето, выводим на консоль “Я люблю лето” и т.д.
 * Используем оператор switch.
 */
public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        
        printSeason(season);
        printSeason(Season.SUMMER);
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
