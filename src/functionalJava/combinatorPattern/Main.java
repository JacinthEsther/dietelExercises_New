package functionalJava.combinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Esther","jacinth@gmail.com","+0349095444",
                LocalDate.of(2002, 4,12));


        System.out.println(new CustomerValidatorService().isValid(customer));
    }
}
