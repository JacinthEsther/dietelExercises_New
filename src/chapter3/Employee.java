package chapter3;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    public Employee(String firstName, String lastName, double salary) {

        checkFirstName(firstName);
        checkLastName(lastName);
        checkSalaryAmount(salary);
    }

    public Employee() {

    }

    private void checkFirstName(String firstName){
        if(!firstName.isEmpty()) this.firstName = firstName;
        else throw new NullPointerException("first name cannot be null");
    }

     private void checkLastName(String lastName){
        if(!lastName.isEmpty()) this.lastName = lastName;
        else throw new NullPointerException("first name cannot be null");
    }


    private void checkSalaryAmount(double salary) {
        if(salary >= 0)  this.salary = salary;
        else throw new NumberFormatException("amount should not be negative");

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        checkFirstName(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        checkLastName(lastName);
    }

    public double getMonthlySalary() {
        return salary;
    }

    public void setMonthlySalary(double salary) {
        checkSalaryAmount(salary);

    }

    public double getYearlySalary() {
        return salary * 12;
    }

    public void newMonthlySalary() {
       salary= getMonthlySalary()*(10*1.0/100) + getMonthlySalary();
    }
}
