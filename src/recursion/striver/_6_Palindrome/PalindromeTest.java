package recursion.striver._6_Palindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {
    @Test
        public void testIsPalindromeOneLetter() {

        String input = "A";

        boolean actual = Palindrome.isPalindrome(input, 0, input.length()-1);

        assertTrue(actual);
    }

    @Test
        public void testIsPalindromeEmpty() {

        String input = "";

        boolean actual = Palindrome.isPalindrome(input, 0, input.length()-1);

        assertTrue(actual);
    }

    @Test
        public void testIsPalindromeFalse() {

        String input = "Apple";

        boolean actual = Palindrome.isPalindrome(input, 0, input.length()-1);

        assertFalse(actual);
    }

    @Test
        public void testIsPalindromeCaseInsensityFalse() {

        String input = "Appa";

        boolean actual = Palindrome.isPalindrome(input, 0, input.length()-1);

        assertFalse(actual);
    }

    @Test
        public void testIsPalindromeTrue() {

        String input = "appa";

        boolean actual = Palindrome.isPalindrome(input, 0, input.length()-1);

        assertTrue(actual);
    }

}
