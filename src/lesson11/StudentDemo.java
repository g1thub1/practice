package lesson11;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Aspirant("Natalia", "Portman", "43", 43, "MyWork");
        Aspirant aspirant = new Aspirant("Tom", "Redcliff", "23", 23, "MySecondWork");
        System.out.println(aspirant.getFirstName() + aspirant.getLastName() + aspirant.getScienceWork());
        System.out.println(student.getFirstName() + student.getLastName() + student.getGroup() + student.getAvgMark());
    }
}
