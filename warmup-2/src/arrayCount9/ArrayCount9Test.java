package arrayCount9;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 30/10/18.
 */
public class ArrayCount9Test {

    @Test
    public void shouldReturnValueZero(){
        Assert.assertEquals(Main.arrayCount9(new int[]{1,2,3}), 0);
        Assert.assertEquals(Main.arrayCount9(new int[]{}), 0);
        Assert.assertEquals(Main.arrayCount9(new int[]{4,2,4,3,1}), 0);
    }


    @Test
    public void shouldReturnValueOne(){
        Assert.assertEquals(Main.arrayCount9(new int[]{1,2,9}), 1);
        Assert.assertEquals(Main.arrayCount9(new int[]{9,2,4,3,1}), 1);
    }


    @Test
    public void shouldReturnValueTwo(){
        Assert.assertEquals(Main.arrayCount9(new int[]{1,9,9}), 2);
        Assert.assertEquals(Main.arrayCount9(new int[]{9,2,4,3,1,9}), 2);
    }


    @Test
    public void shouldReturnValueThree(){
        Assert.assertEquals(Main.arrayCount9(new int[]{9,9,9}), 3);
        Assert.assertEquals(Main.arrayCount9(new int[]{1, 9, 9, 3, 9}), 3);
    }
}
