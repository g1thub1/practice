package lesson19;

import lesson18.Toy;
/**
 * Создать обобщенный класс с тремя параметрами (T, V, K).
 * Класс содержит три переменные типа (T, V, K).
 * Класс содержит конструктор, принимающий на вход параметры типа (T, V, K).
 * Класс содержит методы возвращающие значения трех переменных.
 * Создать метод, выводящий на консоль имена классов для трех переменных класса.
 */
public class GenerClass<T, V, K> {
    private T ob1;
    private V ob2;
    private K ob3;

    public GenerClass(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void setOb3(K ob3) {
        this.ob3 = ob3;
    }

    public void showTypes() {
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
        System.out.println(ob3.getClass().getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenerClass<?, ?, ?> that = (GenerClass<?, ?, ?>) o;

        if (ob1 != null ? !ob1.equals(that.ob1) : that.ob1 != null) return false;
        if (ob2 != null ? !ob2.equals(that.ob2) : that.ob2 != null) return false;
        return ob3 != null ? ob3.equals(that.ob3) : that.ob3 == null;
    }

    @Override
    public int hashCode() {
        int result = ob1 != null ? ob1.hashCode() : 0;
        result = 31 * result + (ob2 != null ? ob2.hashCode() : 0);
        result = 31 * result + (ob3 != null ? ob3.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        GenerClass<Toy, Integer, String> generClass = new GenerClass<>(new Toy(7,"car","drive"), 7, "Hello");
        generClass.showTypes();
    }
}
