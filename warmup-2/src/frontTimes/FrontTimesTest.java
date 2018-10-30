package frontTimes;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 13/09/18.
 */
public class FrontTimesTest {

    @Test
    public void shouldReturnAStringNTimes(){
        Assert.assertEquals(Main.frontTimes("Chocolate", 2), "ChoCho");
        Assert.assertEquals(Main.frontTimes("Chocolate", 3), "ChoChoCho");
        Assert.assertEquals(Main.frontTimes("Abc", 3), "AbcAbcAbc");
        Assert.assertEquals(Main.frontTimes("Ab", 4), "AbAbAbAb");
        Assert.assertEquals(Main.frontTimes("", 4), "");
        Assert.assertEquals(Main.frontTimes("Abc", 0), "");
    }
}
