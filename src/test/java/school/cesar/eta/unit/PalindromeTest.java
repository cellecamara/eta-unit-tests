package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    private Palindrome palindrome = new Palindrome();

    @Test
    public void check_1CharWord_true(){
        String word = "a";
        boolean actual;

        actual = palindrome.check(word);
        Assertions.assertTrue(actual);
    }

    @Test
    public void check_differentStarEndChar_false(){
        String word = "oba";
        boolean actual;

        actual = palindrome.check(word);
        Assertions.assertFalse(actual);
    }

    @Test
    public void check_wordIsPalindrome_true(){
        String word = "sollos";
        boolean actual;

        actual = palindrome.check(word);
        Assertions.assertTrue(actual);
    }

}
