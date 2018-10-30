package countXX;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 13/09/18.
 */
public class CountXXTest {

    @Test
    public void shouldReturnNumberOfXXInGivenString(){
        Assert.assertEquals(Main.countXX("abcxx"), 1);
        Assert.assertEquals(Main.countXX("xxx"), 2);
        Assert.assertEquals(Main.countXX("xxxx"), 3);
        Assert.assertEquals(Main.countXX("abc"), 0);
        Assert.assertEquals(Main.countXX("Hello there"), 0);
        Assert.assertEquals(Main.countXX("Hexxo thxxe"), 2);
        Assert.assertEquals(Main.countXX(""), 0);
        Assert.assertEquals(Main.countXX("Kittens"), 0);
        Assert.assertEquals(Main.countXX("Kittensxxx"), 2);
    }
}
