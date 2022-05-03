package chapter3;

import chapter2.Chapter_2_Dietel;
import chapter3.targetHeartRate.HeartRate;

public class ComputerizedHealthRecord {
    Chapter_2_Dietel number = new Chapter_2_Dietel();

    private final HeartRate heartRate;
    private String gender;
    private double heightInInches;
    private double weightInPounds;

    public ComputerizedHealthRecord(HeartRate heartRate, String gender, double heightInInches, int weightInPounds) {

        this.heartRate = heartRate;
        this.gender = gender;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    public HeartRate getHeartRate() {
        return heartRate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }


    public double getBMI() {
        number.calculateBMI((getWeightInPounds()/2.20462),getHeightInInches()/39.3701);
        return number.getBMI();
    }

    public String getBMIMessage() {
        return number.getBMIMessage();
    }
}
