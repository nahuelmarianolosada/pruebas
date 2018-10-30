package posNeg;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by nlosada on 11/09/18.
 */
public class PosNegTest {

    @Test
    public void shouldReturnTrueIfOneIsNegativeAndOneIsPositiveAndNegativeIsNot(){
        assertTrue(Main.posNeg(-1, 1, false));
        assertTrue(Main.posNeg(1, -1, false));
    }

    @Test
    public void shouldReturnTrueIfNegativeIsNotAndOtherBothAreNegative(){
        assertTrue(Main.posNeg(-1, -1, true));
        assertFalse(Main.posNeg(1, -1, true));
    }
}
