package stringX;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 13/09/18.
 */
public class StringXTest {

    @Test
    public void shouldReturnStringWithoutXButIncludingXInTheFirstPositionAndXInTheLastPosition(){
        Assert.assertEquals(Main.stringX("xxHxix"), "xHix");
        Assert.assertEquals(Main.stringX("abxxxcd"), "abcd");
        Assert.assertEquals(Main.stringX("xabxxxcdx"), "xabcdx");
        Assert.assertEquals(Main.stringX("xKittenx"), "xKittenx");
        Assert.assertEquals(Main.stringX("Hello"), "Hello");
        Assert.assertEquals(Main.stringX("xx"), "xx");
        Assert.assertEquals(Main.stringX("x"), "x");
        Assert.assertEquals(Main.stringX(""), "");
    }
}
