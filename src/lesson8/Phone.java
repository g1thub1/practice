package lesson8;

/**
 * Создайте класс Phone, который содержит переменные number, model и weight.
 * Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 * getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 * Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
 * Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 * Добавить конструктор без параметров.
 * Добавьте в класс Phone перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
 */
public class Phone {
    String number;
    String model;
    double weight = 45;

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String n, String m) {
        number = n;
        model = m;
    }

    Phone() {
    }

    void receiveCall(String name, String number) {
        this.getNumber();
        System.out.println("Звонит " + name + "с номером телефона " + number);
    }

    String getNumber() {
        return number;
    }
}
