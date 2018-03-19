package lesson17;

import java.util.Formatter;

/**
 * Создать строку, используя форматирование:
 * Студент [Фамилия] получил [оценка] по [предмету].
 * Форматирование и вывод строки на консоль написать в отдельном методе, который принимает фамилию,
 * оценку и название предмета в качестве параметров.Выделить под фамилию 15 символов, под оценку 3 символа, предмет – 10.
 * Переделываем предыдущее задание используя метод System.out.printf.
 * Переделать toString() для класса Person используя форматирование.
 */
public class FormaterDemo {
    public static void main(String[] args) {
        createString("Natali", "math.", 5);
        print("Natali", "math.", 5);
        stringFormat("Jack", "art.", 3);
    }

    private static void createString(String fullName, String subject, int mark) {
        Formatter f = new Formatter();
        f.format("Студент %10s получил(a) %3d по %-10s", fullName, mark, subject);
        System.out.println(f);
    }

    private static void print(String fullName, String subject, int mark) {
        System.out.printf("Студент %10s получил(a) %3d по %-10s\n", fullName, mark, subject);
    }

    private static void stringFormat(String fullName, String subject, int mark) {
        String str = String.format("Студент %10s получил(a) %3d по %-10s", fullName, mark, subject);
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
        }
    }
}
