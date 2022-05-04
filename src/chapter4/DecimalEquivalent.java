package chapter4;

public class DecimalEquivalent {
       private  int counter=0;
       private   int total;

    public void decimalEquivalentOf(String number) {
        for (int i = number.length()-1; i >= 0; i--) {

            if (number.charAt(i) == '0' || number.charAt(i) == '1') {
                total += Integer.parseInt(String.valueOf(number.charAt(i))) * Math.pow(2, counter);

                counter++;

            } else throw new IllegalArgumentException("number should be either 0 0r 1");
        }

    }

    public int getDecimalEquivalent() {
        return total;
    }
}
