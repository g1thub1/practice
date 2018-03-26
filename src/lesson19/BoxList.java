package lesson19;

/**
 * Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxList {
    public static void main(String[] args) {
        List<HeavyBox> arrayList = new ArrayList<>();

        arrayList.add(new HeavyBox(1, 3, 4, 5));
        arrayList.add(new HeavyBox(2, 4, 4, 6));
        arrayList.add(new HeavyBox(3, 5, 4, 7));
        arrayList.add(new HeavyBox(4, 6, 4, 8));

        arrayList.add(null);
        //1 вариант
        Object[] objectArray = arrayList.toArray();
        System.out.println(Arrays.toString(objectArray));

        //2 вариант
        HeavyBox[] stringArray1 = new HeavyBox[arrayList.size()];
        arrayList.toArray(stringArray1);
        System.out.println(Arrays.toString(stringArray1));

        //3 вариант
        HeavyBox[] stringArray2 = arrayList.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(stringArray2));
    }
}

