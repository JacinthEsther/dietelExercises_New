package chapter8;

public class SavingsAccount {

    private double savingsBalance;
    private static double annualInterestRate;

    public SavingsAccount(double amountOnDeposit) {
        savingsBalance= amountOnDeposit;
    }

    public void calculateMonthlyInterest() {
        savingsBalance+= savingsBalance * (annualInterestRate/12);
    }

    public  void modifyInterestRate(double interestRate){
        annualInterestRate= interestRate;

    }

    public double getInterestRate() {
        return (double)Math.round(savingsBalance*100)/100;
    }

    public void calculateAnnualInterest() {

        for(int i=1; i <= 12; i++){
            savingsBalance+= savingsBalance * (annualInterestRate/12);
        }
    }

    @Override
    public String toString() {
        String sb = "SavingsAccount{" + "savingsBalance=" + savingsBalance +
                '}';
        return sb;
    }
}
