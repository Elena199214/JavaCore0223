package OOP.task2_1_7;

public enum Day {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");
    private final String rusName;

    Day(String rusName) {
        this.rusName = rusName;
    }

    public boolean isWeekend() {
        if (this == SATURDAY || this == SUNDAY) {
            return true;
        }
        return false;
    }

    public String getRusName() {
        return rusName;
    }
}
