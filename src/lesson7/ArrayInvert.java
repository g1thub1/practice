package lesson7;

/**
 * Created by student on 09.02.2018.
 */
public class ArrayInvert {
    public static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] =  tmp;
        }
    }
}
