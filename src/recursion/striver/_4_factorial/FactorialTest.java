package recursion.striver._4_factorial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FactorialTest {
    @Test
    public void testFactorial0() {

        int input = 0;
        int expected = 0;

        int actual = Factorial.factorial(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFactorial1() {

        int input = 1;
        int expected = 1;

        int actual = Factorial.factorial(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFactorial2() {

        int input = 2;
        int expected = 2;

        int actual = Factorial.factorial(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFactorial5() {

        int input = 5;
        int expected = 120;

        int actual = Factorial.factorial(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFactorial16() {

        int input = 16;
        int expected = 2004189184;

        int actual = Factorial.factorial(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFactorialIntStackOverflows() {

        int input = 17;

        int actual = Factorial.factorial(input);

        assertTrue(actual < 0);
    }

        
}
