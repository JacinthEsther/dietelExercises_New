package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptographyTest {

    @Test
    void onlyFourDigitsCanBeEntered(){
        Cryptography cryptography = new Cryptography();
        cryptography.setRemainder("1234");
        assertEquals(4, cryptography.getSize());
    }
    @Test
    void AddingEachDigitBy7Test(){
        Cryptography cryptography = new Cryptography();
        cryptography.setRemainder("1234");
        assertEquals("891011", cryptography.getRemainder());
    }
    @Test
    void testForAddingEachDigitBy_7_AndGettingRemainderAfterDividingBy_10(){
        Cryptography cryptography = new Cryptography();
        cryptography.setRemainder("1234");
        assertEquals("891011", cryptography.getRemainder());
        assertEquals("8901", cryptography.getRemainderDivisor());

    }

    @Test
    void testForEncryptedDigitAfterSwapping(){
        Cryptography cryptography = new Cryptography();
        cryptography.setRemainder("1234");
        assertEquals("891011", cryptography.getRemainder());
        assertEquals("8901", cryptography.getRemainderDivisor());
        assertEquals("0189", cryptography.getEncryptedDigit());
    }

}
