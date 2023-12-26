package basics.striver._2_ReverseInteger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {
    @Test
    public void test0() {
        
        int input = 0;
        int expected = 0;

        int actual = ReverseInteger.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test1Digit() {
                
        int input = 5;
        int expected = 5;

        int actual = ReverseInteger.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test3Digit() {
                
        int input = 123;
        int expected = 321;

        int actual = ReverseInteger.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testNegative1Digit() {
                
        int input = -2;
        int expected = -2;

        int actual = ReverseInteger.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testNegative3Digit() {
                
        int input = -123;
        int expected = -321;

        int actual = ReverseInteger.reverse(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testLongInteger() {     // Gives correct answer randomly
                
        // int input = 
        int expected = 0;

        int actual = ReverseInteger.reverse(Integer.MAX_VALUE + 1000);

        assertEquals(expected, actual);
    }
    
}
