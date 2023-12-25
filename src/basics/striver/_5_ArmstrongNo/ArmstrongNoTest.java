package basics.striver._5_ArmstrongNo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArmstrongNoTest {
    @Test
    public void testIsArmstrongNo0() {
        
        int input = 0;

        boolean actual = ArmstrongNo.isArmstrongNo(input);

        assertTrue(actual);
    }

    @Test
    public void testIsArmstrongNo1() {
        
        int input = 1;

        boolean actual = ArmstrongNo.isArmstrongNo(input);

        assertTrue(actual);
    }

    @Test
    public void testIsArmstrongNo123() {
        
        int input = 123;

        boolean actual = ArmstrongNo.isArmstrongNo(input);

        assertFalse(actual);
    }

    @Test
    public void testIsArmstrongNo153() {
        
        int input = 153;

        boolean actual = ArmstrongNo.isArmstrongNo(input);

        assertTrue(actual);
    }

    @Test
    public void testIsArmstrongNo370() {
        
        int input = 370;

        boolean actual = ArmstrongNo.isArmstrongNo(input);

        assertTrue(actual);
    }

    @Test
    public void testIsArmstrongNo371() {
        
        int input = 371;

        boolean actual = ArmstrongNo.isArmstrongNo(input);

        assertTrue(actual);
    }

    @Test
    public void testIsArmstrongNo407() {
        
        int input = 407;

        boolean actual = ArmstrongNo.isArmstrongNo(input);

        assertTrue(actual);
    }
}
