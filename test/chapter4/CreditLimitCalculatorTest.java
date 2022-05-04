package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditLimitCalculatorTest {

    CreditLimitCalculator creditLimit;
    @BeforeEach
    void setUp(){
        creditLimit = new CreditLimitCalculator(
                "0011223",13_000, 50,1390,24
        );
    }


    @Test
  void valuesCanBeInput(){

       assertEquals("0011223", creditLimit.getAccountNumber());
       assertEquals(13_000, creditLimit.getBeginningBalance());
       assertEquals(50, creditLimit.getCharges());
       assertEquals(1390, creditLimit.getCredits());
       assertEquals(24, creditLimit.getCreditLimit());

    }

    @Test
    void testForNewBalance(){
        assertEquals(11_660,creditLimit.getNewBalance());
    }

    @Test
    void testToCheckIfCustomersIfCreditLimitExceeds(){
        assertEquals("Credit Limit Exceeded", creditLimit.getCreditMessage());

    }
}
