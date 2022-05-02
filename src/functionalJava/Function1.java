package functionalJava;

import java.util.function.Function;

public class Function1 {

    public static void main(String[] args) {
    int output=increment.andThen(multiplyByTen).apply(1);
        System.out.println(output );
    }

   static Function<Integer, Integer> increment=(number)->number+1;
    static Function <Integer, Integer> multiplyByTen=(number)-> number*10;
}
