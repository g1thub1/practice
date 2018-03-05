package lesson13;

public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир");
        Book book2 = new Book("Идиот");

        Magazine magazine1 = new Magazine("Vogue");
        Magazine magazine2 = new Magazine("Qwerty");

        Printable[] printables = {book1, book2, magazine1, magazine2};
        for (Printable printable : printables) {
            printable.print();
        }

        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}

