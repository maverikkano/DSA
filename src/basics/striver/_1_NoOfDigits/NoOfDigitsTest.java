package basics.striver._1_NoOfDigits;

import org.junit.Test;
import static org.junit.Assert.*;

public class NoOfDigitsTest {

    @Test
    public void testNegative1Digit() {
        int input = -5;

        int expected = 1;

        int result = NoOfDigits.getNoOfDigits(input);

        assertEquals(expected,result);
    }

    @Test
    public void testNegative3Digit() {
        int input = -235;

        int expected = 3;

        int result = NoOfDigits.getNoOfDigits(input);

        assertEquals(expected,result);
    }

    @Test
    public void test0() {
        int input = 0;

        int expected = 1;

        int result = NoOfDigits.getNoOfDigits(input);

        assertEquals(expected,result);
    }

    @Test
    public void test1Digit() {
        int input = 5;

        int expected = 1;

        int result = NoOfDigits.getNoOfDigits(input);

        assertEquals(expected,result);
    }


    @Test
    public void test2Digit() {
        int input = 55;

        int expected = 2;

        int result = NoOfDigits.getNoOfDigits(input);

        assertEquals(expected,result);
    }

    @Test
    public void test3Digit() {
        int input = 235;

        int expected = 3;

        int result = NoOfDigits.getNoOfDigits(input);

        assertEquals(expected,result);
    }

}
