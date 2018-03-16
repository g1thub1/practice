package lesson16;

/**
 * Дано два числа, например 3 и 56, необходимо составить следующие строки:
 * 3 + 56 = 59
 * 3 – 56 = -53
 * 3 * 56 = 168
 * Используем метод StringBuilder.append().
 * Замените символ “=” на слово “равно”.
 * Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
 */
public class AppendDemo {
    public static void main(String[] args) {
        calculate(56, 3);
    }

    private static void calculate(int a, int b) {
        String result;
        StringBuilder strbld = new StringBuilder();

        result = strbld.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n").toString();
        
        strbld.append(a);
        strbld.append(" - ");
        strbld.append(b);
        strbld.append(" = ");
        strbld.append(a - b);
        strbld.append("\n");

        System.out.println(strbld.append(a).append(" * ").append(b).append(" = ").append(a * b));

        int pos = 0;
        while ((pos = strbld.indexOf("=")) != -1) {
            strbld.deleteCharAt(pos);
            strbld.insert(pos, "равно");
        }
        System.out.println(strbld);




    }
}
