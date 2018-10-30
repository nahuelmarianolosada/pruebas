package stringTimes;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 13/09/18.
 */
public class StringTimesTest {

    @Test
    public void shouldReturnAStringNTimes(){
        Assert.assertEquals(Main.stringTimes("Hi", 2), "HiHi");
    }
}
