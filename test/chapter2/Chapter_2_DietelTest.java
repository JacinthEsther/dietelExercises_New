package chapter2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Chapter_2_DietelTest {

    private Chapter_2_Dietel number;
    @BeforeEach
    void setUp(){
         number = new Chapter_2_Dietel();
    }

    @Test
    void testThatTwoNumbersCanBeAdded(){
        number.sumOfNumbers(1,2);
        assertEquals(3, number.getTotal());
    }

    @Test
    void testThatTwoNumbersCanBeMultiplied(){
        number.multiplication(1,2);
        assertEquals(2, number.getProduct());
    }

    @Test
    void testThatSubtracts(){
        number.subtract(1,2);
        assertEquals(-1,number.getTotal());
    }

     @Test
    void testThatDivides(){
        number.divide(1,2);
        assertEquals(0.50,number.total1());
    }


     @Test
    void testThatDivisionByZeroThrowsError(){

        assertThrows(ArithmeticException.class,()->number.divide(2,0)) ;

    }

    @Test
    void testForMaximum(){
        number.maximum(1,78,56);

        assertEquals(78, number.getMaximum());
    }

 @Test
    void testForMinimum(){
        number.minimum(1,78,56);

        assertEquals(1, number.getMinimum());
    }

    @Test
    void testForAverage(){
        number.average(1,15,3);
        assertEquals(6.33, number.getAverage());
    }

    @Test
    void testThatFiveNumbersCanBeAdded(){
        number.sumOfNumbers(2,3,4,5,6,6);
        assertEquals(26, number.getTotal());
    }

    @Test
    void testForOddNumbers(){
        number.checkForOddOrEvenNumbers(5);
        assertEquals("odd", number.checkForOddOrEven());
    }

 @Test
    void testForEvenNumbers(){
        number.checkForOddOrEvenNumbers(6);
        assertEquals("even", number.checkForOddOrEven());
    }

    @Test
    @DisplayName("test to determine if the first number is a multiple of the second number")
    void testForMultipleOfANumber(){
        number.multipleCheck(7,14);
        assertTrue(number.checkMultiple());
    }

 @Test
    @DisplayName("test to determine if the first number is a multiple of the second number")
    void testFor_A_Non_MultipleOfANumber(){
        number.multipleCheck(2,7);
        assertFalse(number.checkMultiple());
    }

   @Test
   void testForDiameterOfACircle(){
        number.calculateDiameterOfACircle(4);
        assertEquals(8, number.getDiameter());

   }

 @Test
   void testForCircumferenceOfACircle(){
        number.calculateCircumferenceOfACircle(4);
        assertEquals(25.13 , number.getCircumference());

   }

    @Test
   void testForAreaOfACircle(){
        number.calculateAreaOfACircle(4);
        assertEquals(50.27 , number.getArea());

   }

   @Test
   @DisplayName("test to calculate the body mass index of a person")
    void testForUnderWeight_BMI(){
        number.calculateBMI(50,1.77);
        assertEquals(15.96, number.getBMI());
        assertEquals("Underweight", number.getBMIMessage());

   }

 @Test
   @DisplayName("test to calculate the body mass index of a person")
    void testForNormal_BMI(){
        number.calculateBMI(80,1.80);
        assertEquals(24.69, number.getBMI());
        assertEquals("Normal", number.getBMIMessage());

   }

    @Test
   @DisplayName("test to calculate the body mass index of a person")
    void testForOverweight_BMI(){
        number.calculateBMI(80,1.70);
        assertEquals(27.68, number.getBMI());
        assertEquals("Overweight", number.getBMIMessage());

   }

     @Test
   @DisplayName("test to calculate the body mass index of a person")
    void testForObese_BMI(){
        number.calculateBMI(80,1.60);
        assertEquals(31.25, number.getBMI());
        assertEquals("Obese", number.getBMIMessage());

   }

   @Test
    void testForWorldPopulationGrowthRate(){
        number.calculateWorldPopulationGrowthRate(790_000_000, 5);

        assertEquals(8.30297938E8, number.getGrowthRate());
   }

   @Test
    void testForDailyDrivingCost(){
        number.carPoolSavings(50,1500,4.5,700,4);

        assertEquals(17370.67, number.getDailyDrivingCost());
   }

//    void testThatIntegerDigitsCanBeSeperated(){
//      number.seperateDigits(1,2,3,4,5);
//      assertEquals(("1 2 3 4 5"), number.getSeperatedDigits());
//
//   }




}
