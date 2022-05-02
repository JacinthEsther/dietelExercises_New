package chapter3.account.User;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        validationFor(name);
        validate(balance);
    }

    private void validate(double balance) {
        if(balance > 0.00) {
            this.balance = balance;
        } else throw new NumberFormatException("account balance must be greater than zero");
    }

    private void validationFor(String name) {

        if (name.isEmpty()) throw new IllegalArgumentException("name cannot be empty");
        else this.name =name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validationFor(name);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) balance +=depositAmount;
        else throw new IllegalArgumentException("you cannot deposit below 1");

    }

    public void withdraw(double withdrawalAmount) {
        if(withdrawalAmount <=balance) balance-=withdrawalAmount;
        else throw new IllegalArgumentException("insufficient fund");

    }
}
