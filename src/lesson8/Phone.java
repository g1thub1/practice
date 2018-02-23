package lesson8;

/**
 * Создайте класс Phone, который содержит переменные number, model и weight.
 * Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 * getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 * Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
 * Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 * Добавить конструктор без параметров.
 * Добавьте в класс Phone перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
 * Создать метод sendMessage в классе Phone с аргументами переменной длины.
 * Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
 * Метод выводит на консоль номера этих телефонов.
 */
public class Phone {
    private String number;
    private String model;
    private double weight = 45;
    private static int count;

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String n, String m) {
        number = n;
        model = m;
        count++;
    }

    Phone() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void receiveCall(String name, String number) {
        this.getNumber();
        System.out.println("Звонит " + name + "с номером телефона " + number);
    }

    void sendMessage(String... numbers) {
        System.out.println("Сообщение отправлено");
        for (String number : numbers) {
            System.out.println(number + " ");
        }
    }
}
