package lesson18;

/**
 * Создать массив содержащий 4 игрушки. Статический метод, который принимает на вход массив игрушек и считает их стоимость.
 * play no static metod выводитт на экран действие
 * нужно подсчитать общее количество игрушек static count
 */
public class Toy {
    private int price;
    private String name, action;

    public Toy() {
    }

    public Toy(int price, String name, String action) {
        this.price = price;
        this.name = name;
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toy toy = (Toy) o;

        if (price != toy.price) return false;
        return name != null ? name.equals(toy.name) : toy.name == null;
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public static int calculatePrice(Toy[] toys) {
        int fullPrice = 0;
        for (Toy t : toys) {
            fullPrice += t.price;
        }
        return fullPrice;
    }

    public static void play() {
        System.out.println();
    }

    public static void main(String[] args) {
        Toy[] toys = {
                new Toy(5,"doll","play"),
                new Toy(7,"car","drive"),
                new Toy(9,"plane","fly")
        };
    }
}
