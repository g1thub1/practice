package lesson5;

public class OddNumber {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        if (i % 2 != 0) {
            System.out.println("Число " + i + " нечетное");
        }
    }
}
