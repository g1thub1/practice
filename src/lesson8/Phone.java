package lesson8;

/**
 * Создайте класс Phone, который содержит переменные number, model и weight.
 * Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 * getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 * Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
 * Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 * Добавить конструктор без параметров.
 */
public class Phone {
    String number;
    String model;
    double weight;

    Phone(String n, String m, double w) {
        number = n;
        model = m;
        weight = w;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    String getNumber() {
        return number;
    }
}
