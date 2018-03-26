package lesson19;

public class HeavyBox1 extends Box6 {
    public int weight; // вес коробки

    public HeavyBox1(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public HeavyBox1() {
        this.weight = -1;
    }

    @Override
    public String toString() {
        return "HeavyBox1{" + "weight=" + weight + "} " + super.toString();
    }
}
