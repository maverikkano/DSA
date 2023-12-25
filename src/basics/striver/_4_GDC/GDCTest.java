package basics.striver._4_GDC;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GDCTest {
    @Test
    public void testGdcSameNo() {
        
        int input1 = 15;
        int input2 = 15;

        int expected = 15;

        int actual = GDC.gdc(input1, input2);

        assertEquals(expected, actual);
    }

    @Test
    public void testGdcPositive() {
        
        int input1 = 35;
        int input2 = 49;

        int expected = 7;

        int actual = GDC.gdc(input1, input2);

        assertEquals(expected, actual);
    }

    @Test
    public void testGdc1Included() {
        
        int input1 = 1;
        int input2 = 15;

        int expected = 1;

        int actual = GDC.gdc(input1, input2);

        assertEquals(expected, actual);
    }

    @Test
    public void testGdcNegative() {
        
        int input1 = 15;
        int input2 = 29;

        int expected = 1;

        int actual = GDC.gdc(input1, input2);

        assertEquals(expected, actual);
    }
}
