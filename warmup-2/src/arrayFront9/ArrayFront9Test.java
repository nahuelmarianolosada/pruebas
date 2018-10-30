package arrayFront9;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 30/10/18.
 */
public class ArrayFront9Test {
    @Test
    public void shouldReturnTrue(){
        Assert.assertTrue(Main.arrayFront9(new int[]{ 1, 2, 9, 3, 4 }));
        Assert.assertTrue(Main.arrayFront9(new int[]{ 9, 2, 3 }));
        Assert.assertTrue(Main.arrayFront9(new int[]{ 1, 9, 9 }));
        Assert.assertTrue(Main.arrayFront9(new int[]{ 1, 9 }));
        Assert.assertTrue(Main.arrayFront9(new int[]{ 3, 9, 2, 3, 3 }));
    }

    @Test
    public void shouldReturnFalse(){
        Assert.assertFalse(Main.arrayFront9(new int[]{ 1, 2, 3, 4, 9 }));
        Assert.assertFalse(Main.arrayFront9(new int[]{ 1, 2, 3, 4, 5 }));
        Assert.assertFalse(Main.arrayFront9(new int[]{ 1, 2, 3 }));
        Assert.assertFalse(Main.arrayFront9(new int[]{ 5, 5 }));
        Assert.assertFalse(Main.arrayFront9(new int[]{  }));
    }
}
