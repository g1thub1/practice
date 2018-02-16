package lesson5;
/**
 * Передать на вход программы число в качестве аргумента. Если оно нечетное, распечатать его. Используем оператор if.
 * Используйте метод Integer.parseInt() для преобразования из String в int.*
 */

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            checkNumber(i);
        }
    }

    private static void checkNumber(int i) {
        if (i > 0 && i < 10) {
            System.out.println("Положительное число меньше 10");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}
