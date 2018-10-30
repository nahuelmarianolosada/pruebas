package or35;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 13/09/18.
 */
public class Or35Test {

    @Test
    public void shouldReturnTrueIfNumIsMultipleOf3(){
        for (int i = 3 ; i <= 150 ; i = i + 3)
        Assert.assertTrue(Main.or35(i));
    }

    @Test
    public void shouldReturnTrueIfNumIsMultipleOf5(){
        for (int i = 5 ; i <= 150 ; i = i + 5)
        Assert.assertTrue(Main.or35(i));
    }

    @Test
    public void shouldReturnFalseIfNumIsNegative(){
        Assert.assertFalse(Main.or35(-2));
    }

    @Test
    public void shouldReturnFalseIfNumIsNotMultipleOf3Or5(){
        Assert.assertFalse(Main.or35(1));
    }

}
