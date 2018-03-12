package lesson15;

/**
 * Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String. startsWith().
 * Распечатать последний символ строки. Используем метод String.charAt().
 */
public class StringDemo {
    public static void main(String[] args) {
        varifyString("I like Java!!");
        charAt();
    }

    private static void charAt() {
        char ch = "I like Java!!".charAt(12);
        System.out.println(ch);
    }

    public static void varifyString(String str) {
        System.out.println(str);

        System.out.println("endsWith " + str.endsWith("!!"));
        System.out.println("endsWith " + str.endsWith("!!!!"));

        System.out.println("startsWith " + str.startsWith("I like"));
        System.out.println("startsWith " + str.startsWith("I hate"));
    }
}
