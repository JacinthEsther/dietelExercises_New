package functionalJava;

import java.util.function.Supplier;

public class SupplierT {


    public static void main(String[] args) {
        System.out.println(getDBConnectionUrlSupplier.get());
    }


    static Supplier<String> getDBConnectionUrlSupplier=()->
            "jdbc:// localhost:5432/users";
}
