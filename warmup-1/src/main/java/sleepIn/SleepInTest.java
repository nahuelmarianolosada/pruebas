package sleepIn;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by nlosada on 10/09/18.
 */
public class SleepInTest {

    @Test
    public void shouldReturnTrueIfItIsNotAWeekdayOrVacationIsTrue(){
        assertTrue(Main.sleepIn(false, true));
    }

    @Test
    public void shouldReturnFalseIfItIsAWeekdayOrVacationIsFalse(){
        assertFalse(Main.sleepIn(true, false));
    }
}
