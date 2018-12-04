package array667;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 30/10/18.
 */
public class Array667Test {

    @Test
    public void shouldReturnZero() {
        Assert.assertEquals(Main.array667(new int[]{}), 0);
        Assert.assertEquals(Main.array667(new int[]{1, 6, 3}), 0);
        Assert.assertEquals(Main.array667(new int[]{6, 1}), 0);
        Assert.assertEquals(Main.array667(new int[]{1, 2, 3, 5, 6}), 0);
    }

    @Test
    public void shouldReturnOne() {
        Assert.assertEquals(Main.array667(new int[]{6, 6, 2}), 1);
        Assert.assertEquals(Main.array667(new int[]{6, 6, 2, 6}), 1);
        Assert.assertEquals(Main.array667(new int[]{6, 7, 2, 6}), 1);
        Assert.assertEquals(Main.array667(new int[]{3, 6, 7, 6}), 1);
        Assert.assertEquals(Main.array667(new int[]{6, 3, 6, 6}), 1);
        Assert.assertEquals(Main.array667(new int[]{1, 2, 3, 6, 6}), 1);
    }

    @Test
    public void shouldReturnTwo() {
        Assert.assertEquals(Main.array667(new int[]{6, 6, 2, 6, 7}), 2);
        Assert.assertEquals(Main.array667(new int[]{3, 6, 6, 7}), 2);
        Assert.assertEquals(Main.array667(new int[]{6, 7, 6, 6}), 2);
    }
}


