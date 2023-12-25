package recursion.striver._3_sumOfnNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfnNumbersTest {
    @Test
    public void testSum5() {

        int input = 5;
        int expected = 15;

        int actual = SumOfnNumbers.sum(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSum3() {

        int input = 3;
        int expected = 6;

        int actual = SumOfnNumbers.sum(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSum0() {

        int input = 0;
        int expected = 0;

        int actual = SumOfnNumbers.sum(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testSum1() {

        int input = 1;
        int expected = 1;

        int actual = SumOfnNumbers.sum(input);

        assertEquals(expected, actual);
    }
}
