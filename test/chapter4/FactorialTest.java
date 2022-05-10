package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    Factorial factorial;
    @BeforeEach
    void setUp(){
        factorial = new Factorial();
    }
    @Test
    void testForFactorialOfNonNegativeInteger(){

        factorial.calculateFactorialOf(5);

        assertEquals(120, factorial.getFactorial());
    }
    @Test
    void negativeIntegerThrowsException(){
        assertThrows(RuntimeException.class,()-> factorial.calculateFactorialOf(-1));
    }

    @Test
    void testForTheExponentialOfANonNegativeInteger(){
        factorial.calculateExponentialOf(5);
        assertEquals(3.59, factorial.getExponential());

    }

}
