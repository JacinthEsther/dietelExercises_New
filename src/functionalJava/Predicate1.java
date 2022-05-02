package functionalJava;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("090956782990"));
        System.out.println(isPhoneNumberValid("09095678299"));


        System.out.println("with predicate");
        System.out.println(isPhoneNumberValidPredicate.test("09095678299"));
        System.out.println(isPhoneNumberValidPredicate.test("090956782992"));

        System.out.println("predicate chain call: is phone number valid and contains number 3");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3)
                .test("09092345634"));
    }


    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("o9") && phoneNumber.length()==11;
    }

    static Predicate<String> containsNumber3=phoneNumber->phoneNumber.contains("3");
    static Predicate<String> isPhoneNumberValidPredicate= phoneNumber->
            phoneNumber.startsWith("o9") && phoneNumber.length()==11;
}
