import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MagicSquareTest {
    @Test
    public void testMagicSquareTrue() {
        int[][] magicMatrix = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };
        assertTrue(MagicSquare.isMagicSquare(magicMatrix));
    }

    @Test
    public void testMagicSquareFalse() {
        int[][] nonMagicMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        assertFalse(MagicSquare.isMagicSquare(nonMagicMatrix));
    }
}
