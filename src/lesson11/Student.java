package lesson11;

/**
 * Создайте пример наследования,  реализуйте класс  Student и класс  Aspirant, аспирант  отличается  от студента  наличием некой научной работы.
 * Класс Student содержит переменные:
 * String firstName, lastName, group;
 * double averageMark - содержащую среднюю оценку.
 * Создать переменную типа Student, которая ссылается на объект типа  Aspirant.
 */
public class Student {
    private String firstName, lastName, group;
    private double avgMark;
    Student student = new Aspirant("Natalia", "Portman", "43", 43, "MyWork");

    public Student(String firstName, String lastName, String group, double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avgMark = avgMark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAvgMark() {
        return avgMark;
    }
}
