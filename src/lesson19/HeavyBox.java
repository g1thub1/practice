package lesson19;

/**
 * Created by student on 26.03.2018.
 */
public class HeavyBox extends Box6 {
    int weight; // вес коробки

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
}

