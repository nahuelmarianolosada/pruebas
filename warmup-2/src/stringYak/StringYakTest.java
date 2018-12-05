package stringYak;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 13/09/18.
 */
public class StringYakTest {

    @Test
    public void shouldReturnStringWithoutYakString(){
        Assert.assertEquals(Main.stringYak("yakpak"), "pak");
        Assert.assertEquals(Main.stringYak("pakyak"), "pak");
        Assert.assertEquals(Main.stringYak("yak123ya"), "123ya");
        Assert.assertEquals(Main.stringYak("yak"), "");
        Assert.assertEquals(Main.stringYak("yakxxxyak"), "xxx");
        Assert.assertEquals(Main.stringYak("HiyakHi"), "HiHi");
        Assert.assertEquals(Main.stringYak("xxxyakyyyakzzz"), "xxxyyzzz");
    }
}