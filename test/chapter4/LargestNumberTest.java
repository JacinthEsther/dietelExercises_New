package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    LargestNumber number;
    @BeforeEach
    void setUp(){
        number = new LargestNumber();

    }

    @Test
    void testForCount(){
        number.addNumber(1,2,3,4,5);
        assertEquals(5, number.getCount());
    }

    @Test
    void testForRecentInput(){
        number.addNumber(1,2,3,4,6,7);
        assertEquals(6, number.getCount());

        assertEquals(7, number.getRecentInput());
    }

    @Test
    void testForMaximum(){
        number.addNumber(1,2,34,4,6,7);
        assertEquals(6, number.getCount());

        assertEquals(7, number.getRecentInput());
        assertEquals(34, number.getMaximum());
    }

    @Test
    void testForSecondMaximum(){
        number.addNumber(1,2,34,4,6,15,12);
        assertEquals(7, number.getCount());

        assertEquals(12, number.getRecentInput());
        assertEquals(34, number.getMaximum());
        assertEquals(15, number.getSecondMaximum());
    }
}
