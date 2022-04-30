package chapter2;

import java.util.Arrays;

public class Chapter_2_Dietel {

     String []seperatedDigits;
    int total= 0;
    double total1=0;
    double product=1;
    int maximum;
     int minimum= Integer.MAX_VALUE;
     double average;
    String oddOrEvenNumber;
    boolean isMultiple;
    int diameter;
    double circumference;
    double area;
    double checkBMI;
    String message;
    double growthRate;
    double growthRate1;
    double dailyDrivingCost;

    public void sumOfNumbers(int... number){
        for (int j : number) {
            total += j;
        }
    }
    public int getTotal() {
        return total;
    }

    public void multiplication(int...number) {
        for (int j : number) {
            product *= j;
        }
    }

    public double getProduct() {
        return product;
    }

    public void subtract(int number1, int number2) {
        total = number1 - number2;
    }

    public void divide(int number1, int number2) {
        if(number2==0){
            throw new ArithmeticException("infinity");
        }
        total1 = number1 *1.0 / number2;
    }

    public double total1(){
        return total1;
    }

    public void maximum(int ...number) {
        for (int j : number) {
            if (j > maximum) maximum = j;
        }
    }

    public int getMaximum() {
        return maximum;
    }

    public void minimum(int...number) {
        for (int j : number) {
            if (j < minimum) minimum = j;
        }
    }


    public int getMinimum() {
        return minimum;
    }

    public void average(int number1, int number2, int number3) {

         total =number1+number2+number3;
         average= total*1.0 / 3;

    }

    public double getAverage() {
        return (double)Math.round(average*100.0)/100.0;
    }


    public void checkForOddOrEvenNumbers(int number) {
        if((number%2)!= 0) oddOrEvenNumber ="odd";
        else oddOrEvenNumber ="even";
    }

    public String checkForOddOrEven() {
        return oddOrEvenNumber;
    }

    public void multipleCheck(int number1, int number2) {
        isMultiple = number2 % number1 == 0;
    }

    public boolean checkMultiple() {
        return isMultiple;
    }

    public void calculateDiameterOfACircle(int radius) {
        diameter = 2 * radius;
    }

    public double getDiameter() {
        return (double)Math.round(diameter*100.0)/100.0;
    }

    public void calculateCircumferenceOfACircle(int radius) {
        circumference= 2*radius*Math.PI;
    }

    public double getCircumference() {
        return (double)Math.round(circumference*100.0)/100.0;
    }

    public void calculateAreaOfACircle(int radius) {

        area = Math.PI * Math.pow(radius, 2);
    }

    public double getArea() {
        return (double)Math.round(area*100.0)/100.0;
    }

    public void calculateBMI(int weightInKilogram, double heightInMetres) {

        checkBMI = weightInKilogram/Math.pow(heightInMetres,2);
    }

    public double getBMI() {
        checkBMIStatus();
        return (double)Math.round(checkBMI*100.0)/100.0;
    }

    private void checkBMIStatus() {
        if((double)Math.round(checkBMI*100.0)/100.0< 18.5) message="Underweight";
        else if((double)Math.round(checkBMI*100.0)/100.0>= 18.5
        &&(double)Math.round(checkBMI*100.0)/100.0 <= 24.9) message="Normal";

        else if((double)Math.round(checkBMI*100.0)/100.0>= 25
        &&(double)Math.round(checkBMI*100.0)/100.0 <= 29.9) message="Overweight";

        else message="Obese";
    }

    public String getBMIMessage() {
        return message;
    }

    public void calculateWorldPopulationGrowthRate(int worldPopulation, int years) {
        double annualIncrease= 1.0/100;
        for(int i = 1; i <= years; i++){
             growthRate =  worldPopulation;
            worldPopulation += (worldPopulation * annualIncrease);

            growthRate1= worldPopulation;
        }
    }

    public double getGrowthRate() {
        return growthRate1;
    }

    public void carPoolSavings(
            int totalMiles, int costPerGallon, double milesPerGallon, int parkingFee, int tolls) {

        dailyDrivingCost = ((totalMiles / milesPerGallon) * costPerGallon) + parkingFee + tolls;
    }

    public double getDailyDrivingCost() {
        return (double)Math.round(dailyDrivingCost*100.0)/100.0;
    }

//    public void seperateDigits(int... number) {
//        seperatedDigits= new String[number.length];
//        for (int i = 0; i < number.length; i++) {
//          seperatedDigits[i]=  String.valueOf(number[i]);
//
//        }
////            return seperatedDigits;
//    }
//    public String getSeperatedDigits(){
//            for (int i = 0; i < seperatedDigits.length;i++){
//            seperatedDigits[i]=   seperatedDigits[i] + " ";
//            }
//        return Arrays.toString(seperatedDigits);
//    }
}
