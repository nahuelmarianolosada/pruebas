package last2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 13/09/18.
 */
public class Last2Test {

    @Test
    public void shouldReturnValueZero(){
        Assert.assertEquals(Main.last2("xaxaxaxx"), 0);
        Assert.assertEquals(Main.last2("13121311"), 0);
        Assert.assertEquals(Main.last2("hi"), 0);
        Assert.assertEquals(Main.last2("h"), 0);
        Assert.assertEquals(Main.last2(""), 0);
    }

    @Test
    public void shouldReturnValueOne(){
        Assert.assertEquals(Main.last2("hixxhi"), 1);
        Assert.assertEquals(Main.last2("xaxxaxaxx"), 1);
        Assert.assertEquals(Main.last2("13121312"), 1);
        Assert.assertEquals(Main.last2("11212"), 1);
    }

    @Test
    public void shouldReturnValueTwo(){
        Assert.assertEquals(Main.last2("axxxaaxx"), 2);
        Assert.assertEquals(Main.last2("xxxx"), 2);
        Assert.assertEquals(Main.last2("1717171"), 2);
    }

    @Test
    public void shouldReturnValueThree(){
        Assert.assertEquals(Main.last2("xxaxxaxxaxx"), 3);
    }
}
