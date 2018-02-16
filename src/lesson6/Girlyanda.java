package lesson6;

import java.util.Scanner;

/**
 * Переписать гирлянду используя оператор switch для  выбора  нужной операции.
 */
public class Girlyanda {
    public static void main(String[] args) {
        int garland = 32;
        Scanner sc = new Scanner(System.in);

        int kol = getKol(sc);

        chooseMode(garland, sc, kol);
        currentState(garland);
        blink(garland, kol);
        runString(garland, kol);

        System.out.println(garland);

    }

    private static int getKol(Scanner sc) {
        System.out.println("Введите количество итераций");
        int kol = 10;
        if (sc.hasNextInt()) {
            kol = sc.nextInt();
        }
        return kol;
    }

    private static void chooseMode(int garland, Scanner sc, int k) {
        System.out.println("Введите значание от 1 до 4");
        if (sc.hasNextInt()) {
            int mode = sc.nextInt();
            switch (mode) {
                case 1:
                    blink(garland, k);
                    break;
                case 2:
                    runString(garland, k);
                    break;
                case 3:
                    currentState(garland);
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }

    static void blink(int g, int kol) {
        for (int i = 0; i < kol; i++) {
            g = ~g;
            currentState(g);
        }
    }

    static void runString(int g, int kol) {
        for (int i = 0; i < kol; i++) {
            g = g << 1;
            System.out.printf("%32s\n", Integer.toBinaryString(g));
        }
    }

    private static void currentState(int garland) {
        System.out.printf("%32s\n", Integer.toBinaryString(garland));
    }


}
