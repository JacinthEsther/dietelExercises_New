package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryCalculatorTest {

    @Test
      void testForSalaryBelowStandardWorkingHour_40HrsPerWeek() {
        SalaryCalculator calculator = new SalaryCalculator(30);

        assertEquals(1125.0, calculator.getSalary());
    }

    @Test
      void testForSalaryForNormalWorkingHour_40HrsPerWeek() {
        SalaryCalculator calculator = new SalaryCalculator(40);

        assertEquals(1500, calculator.getSalary());
    }

        @Test
      void testForSalaryAboveWorkingHour_40HrsPerWeek() {
        SalaryCalculator calculator = new SalaryCalculator(50);

        assertEquals(1900, calculator.getSalary());
    }


        @Test
      void testForEmployeeSalary() {
        SalaryCalculator employee1 = new SalaryCalculator(30);
        SalaryCalculator employee2 = new SalaryCalculator(40);
        SalaryCalculator employee3 = new SalaryCalculator(50);

        assertEquals(1125.0, employee1.getSalary());
        assertEquals(1500, employee2.getSalary());
        assertEquals(1900, employee3.getSalary());
    }
}
