package lesson5;

/*Передать на вход программы число от 1 до 7 в качестве аргумента.
*Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и т.д.  Если 6 или 7 – “Выходной”.
*Используем конструкцию if-else-if.
*/

public class IfElseIf {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        if (i == 1) {
            System.out.println("Monday");
        } else if (i == 2) {
            System.out.println("Tuesday");
        } else if (i == 3) {
            System.out.println("Wednesday");
        } else if (i == 4) {
            System.out.println("Thursday");
        } else if (i == 5) {
            System.out.println("Friday");
        } else if (i == 6 || i == 7) {
            System.out.println("Weekends");
        } else {
            System.out.println("Incorrect number");
        }

    }
}
