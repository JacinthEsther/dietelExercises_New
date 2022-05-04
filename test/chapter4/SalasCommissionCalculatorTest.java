package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalasCommissionCalculatorTest {

    SalesCommissionCalculator calculator;

    @BeforeEach
      void setUp() {
      calculator  = new SalesCommissionCalculator();
    }
    @Test
    void testForWeeklyEarningForOneInput() {
        calculator.addItem(1,1);

        assertEquals(221.60, calculator.getWeeklyEarnings());
    }

    @Test
    void testForWeeklyEarningForMoreThanOneInput(){
        calculator.addItem(2,1);
        calculator.addItem(4,1);
        calculator.addItem(3,2);
        assertEquals(261.25, calculator.getWeeklyEarnings());
    }
}
