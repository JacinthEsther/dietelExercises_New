package functionalJava;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierT {


    public static void main(String[] args) {
        System.out.println(getDBConnectionUrlSupplier.get());

        System.out.println( Optional.ofNullable("Hello")
                .orElseGet(getDBConnectionUrlSupplier));

        Optional.ofNullable("hi")
                .ifPresentOrElse(System.out::println,()->{
                    System.out.println("cannot print null");
                });
    }


    static Supplier<String> getDBConnectionUrlSupplier=()->
            "jdbc:// localhost:5432/users";
}
