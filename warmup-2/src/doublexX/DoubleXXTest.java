package doublexX;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 13/09/18.
 */
public class DoubleXXTest {

    @Test
    public void shouldReturnTrueIfTheFirstXIsFollowedByAnotherX(){
        Assert.assertTrue(Main.doubleX("axxbb"));
        Assert.assertTrue(Main.doubleX("xxxxx"));
        Assert.assertTrue(Main.doubleX("xx"));
    }

    @Test
    public void shouldReturnFalseIfTheFirstXIsNotFollowedByAnotherX(){
        Assert.assertFalse(Main.doubleX("axaxax"));
        Assert.assertFalse(Main.doubleX("xaxxx"));
        Assert.assertFalse(Main.doubleX("aaaax"));
        Assert.assertFalse(Main.doubleX(""));
        Assert.assertFalse(Main.doubleX("abc"));
        Assert.assertFalse(Main.doubleX("x"));
        Assert.assertFalse(Main.doubleX("xax"));
        Assert.assertFalse(Main.doubleX("xaxx"));
    }

}
