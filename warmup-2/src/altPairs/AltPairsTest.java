package altPairs;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 13/09/18.
 */
public class AltPairsTest {

    @Test
    public void shouldReturnExactlyTheseWords(){
        Assert.assertEquals(Main.altPairs("kitten"), "kien");
        Assert.assertEquals(Main.altPairs("Chocolate"), "Chole");
        Assert.assertEquals(Main.altPairs("CodingHorror"), "Congrr");
        Assert.assertEquals(Main.altPairs("yak"), "ya");
        Assert.assertEquals(Main.altPairs("ya"), "ya");
        Assert.assertEquals(Main.altPairs("y"), "y");
        Assert.assertEquals(Main.altPairs(""), "");
        Assert.assertEquals(Main.altPairs("ThisThatTheOther"), "ThThThth");
    }
}
