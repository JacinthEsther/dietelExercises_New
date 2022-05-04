package chapter4;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LargestNumber {

    int totalCount;
    int recentInput;
    OptionalInt maximum;
    int secondMaximum;

    public void addNumber(int ... number) {
//       totalCount= number.length;
      totalCount= (int) Arrays.stream(number).asDoubleStream().count();
       for (int i=0;i < totalCount;i++){
           recentInput=number[number.length-1];
       }
      Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            secondMaximum= number[(number.length-1)-1];
        }
       maximum= Arrays.stream(number).max();
    }

    public int getCount() {
        return totalCount;
    }

    public int getRecentInput() {
        return recentInput;
    }

    public int getMaximum() {
        return maximum.getAsInt();
    }

    public int getSecondMaximum() {
        return secondMaximum;
    }
}
