package lesson8;

/**
 * Создайте класс Phone, который содержит переменные number, model и weight.
 * Добавить в класс Phone методы:
 * receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 * getNumber – возвращает номер телефона.
 * Вызвать эти методы для каждого из объектов.
 */
public class Phone {
    String number;
    String model;
    double weight;

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    String getNumber() {
        return number;
    }
   }
