package lesson16;

/**
 * Изменить регулярное выражение в предыдущем примере для нахождения строк cab, ccab, cccab.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternn {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c+a*b");
        Matcher matcher = pattern.matcher("cab");
        Matcher matcher1 = pattern.matcher("ccab");
        Matcher matcher2 = pattern.matcher("cccab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
