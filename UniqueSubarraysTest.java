import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UniqueSubarraysTest {
    @Test
    public void testUniqueSubarrays() {
        int[] array = {1, 2, 3, 4};
        assertEquals(2, UniqueSubarrays.countUniqueSubarrays(array, 5));
    }
}
