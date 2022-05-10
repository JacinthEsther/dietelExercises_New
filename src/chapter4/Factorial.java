package chapter4;

public class Factorial {
    int total= 1;
    double total2=0;
    int numerator=1;
    double result;
    public void calculateFactorialOf(int number) {
        if(number >0) {
            for (int i = 1; i <= number; i++) {
                total *= i;
            }
        }
        else throw new RuntimeException("number must not be negative");
    }

    public int getFactorial() {

        return total;
    }

    public void calculateExponentialOf(int number) {
        if(number >0) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j < i; j++) {
                    total*=j;
                }
                result = numerator*1.0/total;
                total2 += result;
            }
            total2=1+total2;
        }
        else throw new RuntimeException("number must not be negative");

    }

    public double getExponential() {
        return (double)Math.round(total2*100.0)/100.0;

    }

}
