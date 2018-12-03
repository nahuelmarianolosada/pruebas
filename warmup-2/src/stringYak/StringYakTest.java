package stringYak;

import org.junit.Assert;
import org.junit.Test;
import stringX.Main;

/**
 * Created by nlosada on 13/09/18.
 */
public class StringYakTest {

    @Test
    public void shouldReturnStringWithoutYakString(){
        Assert.assertEquals(stringX.Main.stringX("yakpak"), "pak");
        Assert.assertEquals(stringX.Main.stringX("pakyak"), "pak");
        Assert.assertEquals(stringX.Main.stringX("yak123ya"), "123ya");
        Assert.assertEquals(stringX.Main.stringX("yak"), "");
        Assert.assertEquals(stringX.Main.stringX("yakxxxyak"), "xxx");
        Assert.assertEquals(stringX.Main.stringX("HiyakHi"), "HiHi");
        Assert.assertEquals(stringX.Main.stringX("xxxyakyyyakzzz"), "xxxyyzzz");
    }
}