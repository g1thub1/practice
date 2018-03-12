package lesson14;

/**
 * Создать перечисление, содержащее названия времен года.
 * Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
 * Добавить конструктор принимающий на вход среднюю температуру.
 * Создать метод getDescription, выводящий на консоль “Холодное время года”.
 * Переопределить метод getDescription - для константы Лето метод должен выводить на консоль “Теплое время года”.
 * В цикле распечатки  времен года, вывести на консоль среднюю температуру и описание времени года.
 * Создать  переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
 */
public enum Season {
    WINTER(-40), SPRING(14), SUMMER(35) {
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(5);
    private double avgTemperature;

    Season(double avgTemperature) {
        this.avgTemperature = avgTemperature;
    }

    public double getAvgTemperature() {
        return avgTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
