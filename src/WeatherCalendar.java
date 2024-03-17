public class WeatherCalendar {
    private String month;
    private int numberOfDays;
    public static int rainyDays = 0;
    public static final int year = 2023;
    public static boolean isRainyMonth = false;

    public WeatherCalendar(String month, int numberOfDays) {
        this.month = month;
        this.numberOfDays = numberOfDays;
    }

    public String getMonth() {
        return month;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public static int getRainyDays() {
        return rainyDays;
    }

    public static boolean isIsRainyMonth() {
        return isRainyMonth;
    }

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        rainyDays++;

    }
}

