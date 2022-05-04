package chapter4;

import org.junit.jupiter.api.Test;

public class DecimalEquivalentTest {

    @Test
     void  testForValidNumbers() {
        DecimalEquivalent number = new DecimalEquivalent();

        number.checkNumber(11011);
    }
}
