package frontBack;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 12/09/18.
 */
public class FrontBackTest {

    @Test
    public void shouldExchangeTheFirstAndLastChars(){
        Assert.assertEquals(Main.frontBack("code"),"eodc");
        Assert.assertEquals(Main.frontBack(""),"");
        Assert.assertEquals(Main.frontBack("ab"),"ba");
    }
}
