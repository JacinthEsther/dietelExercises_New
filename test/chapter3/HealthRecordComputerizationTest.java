package chapter3;

import chapter3.targetHeartRate.DateOfBirth;
import chapter3.targetHeartRate.HeartRate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthRecordComputerizationTest {
    private  ComputerizedHealthRecord healthRecord;

    @BeforeEach
    void setUp(){
        DateOfBirth dateOfBirth = new DateOfBirth(4, 12, 2002);
    HeartRate heartRate= new HeartRate("Esther", "Jacinta", dateOfBirth);

     healthRecord = new ComputerizedHealthRecord
                (heartRate,"Female",1.73,8);
    }

    @Test
    void testToGetAllAttributes(){
        assertEquals(healthRecord.getGender(),"Female");
        assertEquals(healthRecord.getHeartRate().getDateOfBirth().getMonth(),4);
        assertEquals(healthRecord.getHeartRate().getDateOfBirth().getDay(), 12);
        assertEquals(healthRecord.getHeartRate().getDateOfBirth().getYear(), 2002);
        assertEquals(healthRecord.getHeartRate().getFirstName(),"Esther");
        assertEquals(healthRecord.getHeartRate().getLastName(),"Jacinta");
        assertEquals(healthRecord.getHeightInInches(),1.73);
        assertEquals(healthRecord.getWeightInPounds(),8);
    }


    @Test
    void ageInYearsCanBeCalculated(){

        assertEquals(20, healthRecord.getHeartRate().getAge());
    }

    @Test
    void testForMaximumHeartRate(){

        assertEquals((220-20),healthRecord.getHeartRate().getMaximumHeartRate());
    }

    @Test
    void testForTargetHeartRate(){
        assertEquals(("100.0 - 170.0"), healthRecord.getHeartRate().getTargetHeartRate());
    }

    @Test
    void testForBMI(){
        assertEquals(healthRecord.getBMI(),2.67);

    }

    @Test
    @DisplayName("test to calculate the body mass index of a person")
    void testForNormal_BMI(){
        assertEquals(healthRecord.getBMI(),2.67);

//        assertEquals(24.69, number.getBMI());
        assertEquals("Normal", healthRecord.getBMIMessage());

    }

//    @Test
//    @DisplayName("test to calculate the body mass index of a person")
//    void testForOverweight_BMI(){
//        number.calculateBMI(80,1.70);
//        assertEquals(27.68, number.getBMI());
//        assertEquals("Overweight", number.getBMIMessage());
//
//    }
//
//    @Test
//    @DisplayName("test to calculate the body mass index of a person")
//    void testForObese_BMI(){
//        number.calculateBMI(80,1.60);
//        assertEquals(31.25, number.getBMI());
//        assertEquals("Obese", number.getBMIMessage());
//
//    }
}
