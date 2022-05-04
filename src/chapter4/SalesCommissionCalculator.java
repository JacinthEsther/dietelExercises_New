package chapter4;

import java.util.ArrayList;
import java.util.List;

public class SalesCommissionCalculator {

    private List<Double> items = new ArrayList<>();
    private double value;


    public void addItem(int item, int quantity) {

       switch (item) {
           case 1-> value= 239.99;
           case 2-> value = 129.75;
           case 3 -> value = 99.95;
           case 4 -> value = 350.89;
       }

        items.add(value*quantity);
    }

    public double getWeeklyEarnings() {
        double total= 0;
        for(Double valueOfItem : items) {
            total+=valueOfItem;
        }
        return (double)Math.round((200+ (total *0.09))*100.0)/100.0;
    }


}
