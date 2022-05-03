package chapter4;

import java.util.ArrayList;
import java.util.List;

public class GasMileage {

    private double miles;
    private int gallon;
    List<GasMileage> noOfTrips = new ArrayList<>();
    double total;


    public GasMileage(double miles, int gallon) {
        this.miles = miles;
        this.gallon = gallon;
    }

    public GasMileage() {

    }

    public void save(GasMileage gasMileage){
        total+=(gasMileage.miles/gasMileage.gallon);
        noOfTrips.add(gasMileage);
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public int getGallon() {
        return gallon;
    }

    public void setGallon(int gallon) {
        this.gallon = gallon;
    }

    public double getMilesPerGallon() {

        return getMiles()/getGallon();
    }

    public double getNoOfTrips() {
        return noOfTrips.size();
    }

    public double getCombinedMilesPerGallon() {
        return  total*noOfTrips.size();
    }

}
