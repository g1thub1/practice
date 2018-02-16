package lesson8;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("88005553535", "HTC", 4.5);
        Phone phone2 = new Phone("98603402385", "Apple");
        Phone phone3 = new Phone();

        System.out.println("Номер " + phone1.number + " модель " + phone1.model
                + " вес " + phone1.weight);
        System.out.println("Номер " + phone2.number + " модель " + phone2.model
                + " вес " + phone2.weight);
        System.out.println("Номер " + phone3.number + " модель " + phone3.model
                + " вес " + phone3.weight + "\n");

        phone1.receiveCall("Maмa ");
        System.out.print(phone1.getNumber());
    }
}
