package stringSplosion;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by nlosada on 13/09/18.
 */
public class StringSplosionTest {

    @Test
    public void shouldReturnAStringNTimes(){
        Assert.assertEquals(Main.stringSplosion("Code"), "CCoCodCode");

        Assert.assertEquals(Main.stringSplosion("abc") , "aababc");
        Assert.assertEquals(Main.stringSplosion("ab") , "aab");
        Assert.assertEquals(Main.stringSplosion("x") , "x");
        Assert.assertEquals(Main.stringSplosion("fade") , "ffafadfade");
        Assert.assertEquals(Main.stringSplosion("There") , "TThTheTherThere");
        Assert.assertEquals(Main.stringSplosion("Kitten") , "KKiKitKittKitteKitten");
        Assert.assertEquals(Main.stringSplosion("Bye") , "BByBye");
        Assert.assertEquals(Main.stringSplosion("Good") , "GGoGooGood");
        Assert.assertEquals(Main.stringSplosion("Bad") , "BBaBad");
        
    }
}
