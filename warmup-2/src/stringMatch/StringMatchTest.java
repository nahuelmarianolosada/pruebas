package stringMatch;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 30/10/18.
 */
public class StringMatchTest {

    @Test
    public void shouldReturnZero() {
        Assert.assertEquals(Main.stringMatch("abc", "axc"),0);
        Assert.assertEquals(Main.stringMatch("h", "hello"),0);
        Assert.assertEquals(Main.stringMatch("", "hello"),0);
    }

    @Test
    public void shouldReturnOne() {
        Assert.assertEquals(Main.stringMatch("hello", "he"),1);
        Assert.assertEquals(Main.stringMatch("he", "hello"),1);
        Assert.assertEquals(Main.stringMatch("aabbccdd", "abbbxxd"),1);
    }

    @Test
    public void shouldReturnTwo() {
        Assert.assertEquals(Main.stringMatch("abc", "abc"),2);
    }

    @Test
    public void shouldReturnThree() {
        Assert.assertEquals(Main.stringMatch("xxcaazz", "xxbaaz"),3);
        Assert.assertEquals(Main.stringMatch("aaxxaaxx", "iaxxai"),3);
        Assert.assertEquals(Main.stringMatch("iaxxai", "aaxxaaxx"),3);
    }
}


