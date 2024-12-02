import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The PalindromicSubstringTest class provides unit tests for the PalindromicSubstring class.
 */
public class PalindromicSubstringTest {

    /**
     * Tests if the findLongestPalindromicSubstring method correctly finds the
     * longest palindromic substring.
     */
    @Test
    public void testLongestPalindromicSubstring() {
        String input = "babad";
        String expected = "bab"; // "aba" is also a valid result
        String result = PalindromicSubstring.findLongestPalindromicSubstring(input);
        assertTrue(result.equals("bab") || result.equals("aba"));
    }
}
