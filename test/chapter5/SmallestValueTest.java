package chapter5;

import org.junit.jupiter.api.Test;

public class SmallestValueTest {

    @Test
    void numbersCanBeInputted(){
        SmallestValue value = new SmallestValue();
        value.collectNumber(1234);

    }
}
