package chapter4;

import java.util.Optional;

public class Palindrome {
    private boolean isPalindrome;
    public void check(String number) {

        Optional.of(number.length()==5)
                .ifPresentOrElse((number1)->{
                    if(number.length()==5) {
                        for (int i = 0; i < number.length(); i++) {
                            if (number.charAt(0) == number.charAt(4) &&
                                    (number.charAt(1) == number.charAt(3))) isPalindrome = true;
                            else isPalindrome = false;
                        }
                    }
                        else throw new RuntimeException("number length exceeds five");


                },()->{
                  throw new RuntimeException("number length exceeds five");
                });
    }

    public boolean isPalindrome() {
        return isPalindrome;
    }
}
