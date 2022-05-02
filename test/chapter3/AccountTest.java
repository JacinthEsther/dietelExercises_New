package chapter3;

import chapter3.account.User.Account;
import org.junit.jupiter.api.Test;

import java.io.InvalidObjectException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    @Test
    public void accountCanBeCreated(){
        Account userAccount= new Account("Jacinth", 34.50);
         assertEquals(userAccount.getName(), "Jacinth");
    }


    @Test
    public void accountNameCannotBeAnEmptyString(){
        Account userAccount = new Account("Jacinth", 34.50);

        assertThrows(IllegalArgumentException.class,()->userAccount.setName(""));
    }

    @Test
    public void accountBalanceOnCreationMustBeGreaterThan_0(){
        assertThrows(NumberFormatException.class,()->{
            Account userAccount = new Account("Jacinth", 0.00);
        });
    }

    @Test
    public void userCanMakeDeposit(){
        Account account = new Account("Jacinth", 15.00);

        account.deposit(6000);
        assertEquals(6015, account.getBalance());
    }

    @Test
    public void userCannotDepositAnAmountLessThan_1(){
        Account account = new Account("Jacinth",15.00);

        assertThrows(IllegalArgumentException.class,()->account.deposit(0.00));
    }

    @Test
    public void userCanWithdrawFromAccount(){
        Account account = new Account("Jacinth", 15.00);

        account.deposit(6000);
        assertEquals(6015, account.getBalance());

        account.withdraw(3000);
        assertEquals(3015, account.getBalance());
    }

    @Test
    public void userCannotWithdrawAboveBalance(){
        Account account = new Account("Jacinth", 15.00);

        account.deposit(6000);
        assertEquals(6015, account.getBalance());


        assertThrows(IllegalArgumentException.class,()->account.withdraw(6017));

    }
}
