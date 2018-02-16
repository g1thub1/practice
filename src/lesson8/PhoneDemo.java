package lesson8;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.number = "88005553535";
        phone1.model = "HTC";
        phone1.weight = 4.5;

        phone2.number = "98603402385";
        phone2.model = "Apple";
        phone2.weight = 9;

        phone3.number = "09547558585";
        phone3.model = "Nokia";
        phone3.weight = 5;

        System.out.println("Номер " + phone1.number + " модель " + phone1.model
                + " вес " + phone1.weight);
        System.out.println("Номер " + phone2.number + " модель " + phone2.model
                + " вес " + phone2.weight);
        System.out.println("Номер " + phone3.number + " модель " + phone3.model
                + " вес " + phone3.weight + "\n");

        phone1.receiveCall("Mama");
        System.out.println(phone1.getNumber());
    }
}
