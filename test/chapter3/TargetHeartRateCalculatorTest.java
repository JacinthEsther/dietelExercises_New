package chapter3;

import chapter3.targetHeartRate.DateOfBirth;
import chapter3.targetHeartRate.HeartRate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TargetHeartRateCalculatorTest {

    private  HeartRate heartRate;
@BeforeEach
void setUp(){
    DateOfBirth dateOfBirth = new DateOfBirth(4, 12, 2002);
    heartRate= new HeartRate("Esther", "Jacinta", dateOfBirth);

}
    @Test
  void heartRateClassCanBeCreated() {

        assertEquals(heartRate.getDateOfBirth().getMonth(), 4);
        assertEquals(heartRate.getDateOfBirth().getDay(), 12);
        assertEquals(heartRate.getDateOfBirth().getYear(), 2002);
        assertEquals(heartRate.getFirstName(),"Esther");
        assertEquals(heartRate.getLastName(),"Jacinta");

    }

    @Test
    void ageInYearsCanBeCalculated(){

        assertEquals(20, heartRate.getAge());
    }

    @Test
    void testForMaximumHeartRate(){

        assertEquals((220-20),heartRate.getMaximumHeartRate());
    }

    @Test
    void testForTargetHeartRate(){
    assertEquals(("100.0 - 170.0"), heartRate.getTargetHeartRate());
    }
}
