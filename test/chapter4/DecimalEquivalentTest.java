package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecimalEquivalentTest {

    @Test
     void testForValidNumbers() {
        DecimalEquivalent number = new DecimalEquivalent();

       number.decimalEquivalentOf("1101");

       assertEquals(13, number.getDecimalEquivalent());
    }

    @Test
     void numberAbove_1_ThrowsException() {
        DecimalEquivalent number = new DecimalEquivalent();

       assertThrows(IllegalArgumentException.class,()->number.decimalEquivalentOf("11012"));
    }
}
