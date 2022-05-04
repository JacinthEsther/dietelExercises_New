package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {


    @Test
    void onlyFiveInputIsAllowedTest(){
        Palindrome palindromeCheck = new Palindrome();
        palindromeCheck.check("12345");
        assertFalse(palindromeCheck.isPalindrome());

    }

    @Test
    void inputLessThanFiveThrowsException(){
        Palindrome palindromeCheck = new Palindrome();
       assertThrows(RuntimeException.class,()->palindromeCheck.check("2345")) ;
    }

 @Test
    void inputMoreThanFiveThrowsException(){
        Palindrome palindromeCheck = new Palindrome();
       assertThrows(RuntimeException.class,()->palindromeCheck.check("123456")) ;
    }

    @Test
    void palindromeCheckTest(){
        Palindrome palindromeCheck = new Palindrome();
        palindromeCheck.check("54345");
        assertTrue(palindromeCheck.isPalindrome());

    }

}
