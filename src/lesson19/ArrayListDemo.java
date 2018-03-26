package lesson19;

import java.util.List;
import java.util.ArrayList;

/**
 * Создать динамический массив, содержащий объекты класса HeavyBox.
 * Распечатать его содержимое используя for each.
 * Изменить вес первого ящика на 1.
 * Удалить последний ящик.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox1> list = new ArrayList<>();

        list.add(new HeavyBox1());
        list.add(new HeavyBox1(1, 4, 4, 8));
        HeavyBox1 heavyBox1 = new HeavyBox1(1, 2, 3, 4);
        list.add(heavyBox1);

        System.out.println("Get size " + list.size());
        System.out.println(list);

        for (HeavyBox1 box : list) {
            System.out.println("Element " + box);
        }
    }
}
