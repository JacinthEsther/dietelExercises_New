package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageTest {
    @Test
    void testForMilesPerGallon(){
        GasMileage milesPerGallon= new GasMileage(3.0, 3);

        assertEquals((3.0/3), milesPerGallon.getMilesPerGallon());
    }

    @Test
    void testForCombinedMilesPerGallon(){
        GasMileage gasMileage = new GasMileage();
        GasMileage milesPerGallon1= new GasMileage(3.0, 3);
        GasMileage milesPerGallon2= new GasMileage(6.0, 3);
        GasMileage milesPerGallon3= new GasMileage(9.0, 3);
        GasMileage milesPerGallon4= new GasMileage(18.0, 3);


        gasMileage.save(milesPerGallon1);
        gasMileage.save(milesPerGallon2);
        gasMileage.save(milesPerGallon3);
        gasMileage.save(milesPerGallon4);

        assertEquals((3.0/3), milesPerGallon1.getMilesPerGallon());
        assertEquals((6.0/3), milesPerGallon2.getMilesPerGallon());
        assertEquals((9.0/3), milesPerGallon3.getMilesPerGallon());
        assertEquals((18.0/3), milesPerGallon4.getMilesPerGallon());

        assertEquals(4, gasMileage.getNoOfTrips());

        assertEquals(48, gasMileage.getCombinedMilesPerGallon());

    }

}
