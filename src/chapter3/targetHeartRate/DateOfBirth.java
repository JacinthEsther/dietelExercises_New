package chapter3.targetHeartRate;

public class DateOfBirth {
    private final int month;
    private final int day;
    private final int year;


    public DateOfBirth(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {

        return "DateOfBirth{" + month + "-" + day + "-" + year;
    }
}
