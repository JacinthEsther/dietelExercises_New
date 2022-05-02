package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    @Test
    void EmployeeClassCanBeCreated() {
        Employee employee1 = new Employee("Esther", "Jacinth", 1_000_000);

        assertEquals("Esther", employee1.getFirstName());
        assertEquals("Jacinth", employee1.getLastName());
        assertEquals(1_000_000, employee1.getMonthlySalary());
    }
    @Test
    void firstNameCannotBeEmpty() {
        assertThrows(NullPointerException.class, () -> {
            Employee employee = new Employee("", "Jacinth", 1000);
        });
    }
  @Test
    void lastNameCannotBeEmpty() {
        assertThrows(NullPointerException.class, () -> {
            Employee employee = new Employee("esther", "", 1000);
        });
    }

    @Test
    void monthlySalaryCannotBeNegative() {
        assertThrows(NumberFormatException.class, () -> {
            Employee employee1 = new Employee("Esther", "Jacinth", -1.0);
        });
    }

    @Test
    void yearlySalaryCanBeCalculated() {
        Employee employee1 = new Employee("Esther", "Jacinth", 1_000_000);
        Employee employee2 = new Employee("Jacinth", "Esther", 5_000_000);

        assertEquals(12_000_000,employee1.getYearlySalary());
        assertEquals(60_000_000,employee2.getYearlySalary());
    }

 @Test
    void yearlySalaryCanBeCalculatedAfter_10_PercentRaise() {
        Employee employee1 = new Employee("Esther", "Jacinth", 1_000_000);
        Employee employee2 = new Employee("Jacinth", "Esther", 5_000_000);

        employee1.newMonthlySalary();
        employee2.newMonthlySalary();

        assertEquals(13_200_000,employee1.getYearlySalary());
        assertEquals(66_000_000,employee2.getYearlySalary());
    }

    @Test
    void testForSetMethods() {
        Employee employee = new Employee();

        employee.setFirstName("Esther");
        employee.setLastName("Jacinta");
        employee.setMonthlySalary(1200000);

        assertEquals("Esther", employee.getFirstName());
        assertEquals("Jacinta", employee.getLastName());
        assertEquals(1200000, employee.getMonthlySalary());

    }

}
