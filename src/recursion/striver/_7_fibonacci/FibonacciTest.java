package recursion.striver._7_fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
    @Test
    public void testFibonacci1() {

        int input = 1;
        int expected = 1;

        int actual = Fibonacci.fibonacci(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFibonacci2() {

        int input = 2;
        int expected = 2;

        int actual = Fibonacci.fibonacci(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFibonacci3() {

        int input = 3;
        int expected = 3;

        int actual = Fibonacci.fibonacci(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFibonacci4() {

        int input = 4;
        int expected = 5;

        int actual = Fibonacci.fibonacci(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFibonacci5() {

        int input = 7;
        int expected = 21;

        int actual = Fibonacci.fibonacci(input);

        assertEquals(expected, actual);
    }

    
}
