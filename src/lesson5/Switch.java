package lesson5;

/**
 * Передать на вход программы число от 1 до 7 в качестве аргумента.
 * Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и т.д.  Если 6 или 7 – “Выходной”.
 * Используем конструкцию switch.
 */
public class Switch {
    public static void main(String[] args) {
        switch (args[0]) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
            case "7":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Incorrect number");
        }

    }
}
