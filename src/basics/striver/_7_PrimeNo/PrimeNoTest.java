package basics.striver._7_PrimeNo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeNoTest {
    @Test
    public void testIsPrime0() {

        int input = 0;
        boolean actual = PrimeNo.isPrime(input);

        assertFalse(actual);
    }

    @Test
    public void testIsPrime1() {

        int input = 1;
        boolean actual = PrimeNo.isPrime(input);

        assertFalse(actual);
    }

    @Test
    public void testIsPrime2() {

        int input = 2;
        boolean actual = PrimeNo.isPrime(input);

        assertTrue(actual);
    }

    @Test
    public void testIsPrime10() {

        int input = 10;
        boolean actual = PrimeNo.isPrime(input);

        assertFalse(actual);
    }

    @Test
    public void testIsPrime13() {

        int input = 13;
        boolean actual = PrimeNo.isPrime(input);

        assertTrue(actual);
    }
}
