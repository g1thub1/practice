package lesson15;

/**
 * Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String. startsWith().
 */
public class StringDemo {
    public static void main(String[] args) {
        varifyString("I like Java!!");
    }

    public static void varifyString(String str) {
        System.out.println(str);

        System.out.println("endsWith " + str.endsWith("!!"));
        System.out.println("endsWith " + str.endsWith("!!!!"));

        System.out.println("startsWith " + str.startsWith("I like"));
        System.out.println("startsWith " + str.startsWith("I hate"));
    }
}
