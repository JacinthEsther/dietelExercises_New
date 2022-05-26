package chapter8;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {

    @Test
      void monthlyInterestRateTest() {
        SavingsAccount savingAccount = new SavingsAccount(2000.00);
        savingAccount.modifyInterestRate(0.04);
        savingAccount.calculateMonthlyInterest();

        assertEquals(2006.67,savingAccount.getInterestRate());
    }

    @Test
      void AnnualInterestRateTest() {
        SavingsAccount savingAccount = new SavingsAccount(2000.00);
        savingAccount.modifyInterestRate(0.04);
        savingAccount.calculateAnnualInterest();

        assertEquals(2081.48,savingAccount.getInterestRate());
    }


}
