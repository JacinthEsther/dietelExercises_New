package chapter4;

public class SalaryCalculator {
    private  int workHourPerWeek;
    double totalWage;

    public SalaryCalculator(int workHourPerWeek) {
        this.workHourPerWeek = workHourPerWeek;
    }

    public int getWorkHourPerWeek() {
        return workHourPerWeek;
    }

    public void setWorkHourPerWeek(int workHourPerWeek) {
        this.workHourPerWeek = workHourPerWeek;
    }

    public double getSalary() {
        int standardHours = 40;
        double standardWage = 37.50;
        double overtimeBonus = 2.50;

        if (getWorkHourPerWeek() > 40)
            totalWage = (standardWage * getWorkHourPerWeek())
                    + (getWorkHourPerWeek() - standardHours) * overtimeBonus;
        else if (getWorkHourPerWeek() < 40)
            totalWage = standardWage * getWorkHourPerWeek();
        else
            totalWage = standardWage * standardHours;

        return totalWage;
    }
}
