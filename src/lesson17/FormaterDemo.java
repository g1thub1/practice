package lesson17;

import java.util.Formatter;

/**
 * Создать строку, используя форматирование:
 * Студент [Фамилия] получил [оценка] по [предмету].
 * Форматирование и вывод строки на консоль написать в отдельном методе, который принимает фамилию, оценку и название предмета в качестве параметров.
 */
public class FormaterDemo {
    public static void main(String[] args) {
        createString("Natali", "math", 5);
        createString("Jack", "art", 3);
    }

    private static void createString(String fullName, String subject, int mark) {
        Formatter f = new Formatter();
        f.format("Студент %s получил %d по %s \n", fullName, mark, subject);
        System.out.println(f);
    }
}
