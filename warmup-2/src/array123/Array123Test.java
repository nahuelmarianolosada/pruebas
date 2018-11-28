package array123;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 30/10/18.
 */
public class Array123Test {

    @Test
    public void shouldReturnTrue() {
        Assert.assertTrue(array123.Main.array123(new int[]{1, 1, 2, 3, 1}));
        Assert.assertTrue(array123.Main.array123(new int[]{1, 1, 2, 1, 2, 3}));
        Assert.assertTrue(array123.Main.array123(new int[]{1, 2, 3, 1, 2, 3}));
        Assert.assertTrue(array123.Main.array123(new int[]{1, 2, 3}));
    }

    @Test
    public void shouldReturnFalse() {
        Assert.assertFalse(array123.Main.array123(new int[]{1, 1, 2, 4, 1}));
        Assert.assertFalse(array123.Main.array123(new int[]{1, 1, 2, 1, 2, 1}));
        Assert.assertFalse(array123.Main.array123(new int[]{1, 1, 1}));
        Assert.assertFalse(array123.Main.array123(new int[]{1, 2}));
        Assert.assertFalse(array123.Main.array123(new int[]{1}));
        Assert.assertFalse(array123.Main.array123(new int[]{}));
    }
}


