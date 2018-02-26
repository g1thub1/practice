package lesson11;

/**
 * Создайте пример наследования,  реализуйте класс  Student и класс  Aspirant, аспирант  отличается  от студента  наличием некой научной работы.
 * Класс Student содержит переменные: String firstName, lastName, group;
 * double averageMark - содержащую среднюю оценку.
 * Создать переменную типа Student, которая ссылается на объект типа  Aspirant.
 * Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
 * Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80.
 * Переопределить метод в классе Aspirant. Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
 * Создать массив типа Student, содержащий объекты класса Student и Aspirant.
 * Вызвать метод getScholarship() для каждого элемента массива.
 */
public class Student {
    private String firstName, lastName, group;
    private double avgMark;

    public Student(String firstName, String lastName, String group, double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avgMark = avgMark;
    }

    public double getScholarship() {
        if (avgMark == 5.6) {
            return 100;
        } else {
            return 180;
        }
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
