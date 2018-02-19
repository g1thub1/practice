package lesson8;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("88005553535", "HTC", 4.5);
        Phone phone2 = new Phone("98603402385", "Apple");
        Phone phone3 = new Phone();

        System.out.println(Phone.getCount());

        System.out.println("Номер " + phone1.getNumber() + " модель " + phone1.getModel()
                + " вес " + phone1.getWeight());
        System.out.println("Номер " + phone2.getNumber() + " модель " + phone2.getModel()
                + " вес " + phone2.getWeight());
        System.out.println("Номер " + phone3.getNumber() + " модель " + phone3.getModel()
                + " вес " + phone3.getWeight() + "\n");

        phone1.receiveCall("Maмa ", "88005553535");
        System.out.println(phone1.getNumber());

        phone1.sendMessage("88005553535");
        phone2.sendMessage("753707","875680","762260");
    }
}
