package lesson15;

/**
 * Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String. startsWith().
 * Распечатать последний символ строки. Используем метод String.charAt().
 * Найти позицию подстроки “Java” в строке “I like Java!!!”
 * Заменить все символы “а” на “о”.
 * Преобразуйте строку к верхнему регистру.
 * Преобразуйте строку к нижнему регистру.
 * Вырезать строку Java c помощью метода String.substring.
 */
public class StringDemo {
    public static void main(String[] args) {
        varifyString("I like Java!!");
        strLength("I like abc");
        charAt();
        find("I love Java!!");
        registerr();
        registerr1("I like Java!!");
        subbString();
    }

    private static void subbString() {
        System.out.println("I like Java!".substring(7));
        System.out.println("I like Java!".substring(5, 11));
    }

    private static void registerr1(String str) {
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }

    private static void registerr() {
        System.out.println("I like Avaj!!".replace('a', 'o'));
        System.out.println("I like AVAJ!!".toLowerCase());
        System.out.println("I like AVAJ!!".toUpperCase());
    }

    private static void find(String str) {
        System.out.println(str.indexOf("love"));
    }

    private static void charAt() {
        char ch = "I like Java!!".charAt(12);
        System.out.println(ch);
    }

    private static void strLength(String str) {
        int len = str.length() - 1;
        System.out.println(str.charAt(len));
    }

    public static void varifyString(String str) {
        System.out.println(str);

        System.out.println("endsWith " + str.endsWith("!!"));
        System.out.println("endsWith " + str.endsWith("!!!!"));

        System.out.println("startsWith " + str.startsWith("I like"));
        System.out.println("startsWith " + str.startsWith("I hate"));
    }
}
