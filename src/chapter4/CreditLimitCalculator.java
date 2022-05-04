package chapter4;

public class CreditLimitCalculator {

    private String accountNumber;
    private double beginningBalance;
    private double charges;
    private double credits;
    private double creditLimit;
    private String message;


    public CreditLimitCalculator(String accountNumber, double beginningBalance, double Charges,
                                 double credits, double creditLimit) {

        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.charges = Charges;
        this.credits = credits;
        this.creditLimit = creditLimit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBeginningBalance() {
        return beginningBalance;
    }

    public void setBeginningBalance(double beginningBalance) {
        this.beginningBalance = beginningBalance;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }


    public double getNewBalance() {

        return (getBeginningBalance() + getCharges()) - getCredits();
    }

    public String getCreditMessage() {
        if(getNewBalance() > getCreditLimit()) {
            message = "Credit Limit Exceeded";
        }
        return message;
    }
}
