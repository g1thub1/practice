package lesson5;
/**Распечатать 10 строк:
 “Task1”.
 …
 “Task10”.
 Используем цикл while.
 */
public class While {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 10) {
            System.out.println("Task " + n++);
        }
    }
}