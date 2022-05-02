package functionalJava;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer_ {
    // a consumer represents an operation that accepts a single input argument and returns no result

    public static void main(String[] args) {
        greetCustomer(new Customer("Jacinth","0090999"));

        //consumer functional interface
        Customer jacinth = new Customer("Jacinth","0090999");

        greetCustomer.accept(jacinth);

        // consumer bifunctional interface
        greetCustomer2.accept(jacinth,false);
    }

    //consumer bifunctional interface
    static BiConsumer<Customer,Boolean> greetCustomer2= (customer,showPhoneNumber )->
            System.out.printf("Hello %s, thanks for registering your phone number (%s) ",
                    customer.customerName, (showPhoneNumber?customer.customerPhoneNumber: "********"));

    //consumer functional interface
    static Consumer<Customer> greetCustomer= customer ->
            System.out.printf("Hello %s, thanks for registering your phone number (%s)%n ",
    customer.customerName, customer.customerPhoneNumber);


    static void greetCustomer(Customer customer){
      String print=  String.format("Hello %s, thanks for registering your phone number (%s) ",
                customer.customerName, customer.customerPhoneNumber);
        System.out.println(print);
    }
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
