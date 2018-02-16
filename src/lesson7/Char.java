package lesson7;

import java.util.Arrays;

/**
 * Создать двумерный массив типа char размером 4х2.
 * И записать туда значения с помощью блока для инициализации.
 * Распечатать значения массива с помощью метода Arrays.deepToString(m).
 */
public class Char {
    public static void main(String[] args) {
        char[][] array = {
                {'a', 'b'},
                {'c', 'd'},
                {'e', 'f'},
                {'g', 'i'}
        };
        System.out.println(Arrays.deepToString(array));
    }
}
