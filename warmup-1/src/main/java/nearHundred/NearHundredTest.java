package nearHundred;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by nlosada on 11/09/18.
 */
public class NearHundredTest {

    @Test
    public void shouldReturnTrueIfNumberIsWithin10Of100(){
        assertTrue(Main.nearHundred(93));
    }
    @Test
    public void shouldReturnFalseIfNumberIsNotWithin10Of100(){
        assertFalse(Main.nearHundred(50));
    }

    @Test
    public void shouldReturnTrueIfNumberIsWithin10Of200(){
        assertTrue(Main.nearHundred(193));
    }
    @Test
    public void shouldReturnFalseIfNumberIsNotWithin10Of200(){
        assertFalse(Main.nearHundred(150));
    }
}
