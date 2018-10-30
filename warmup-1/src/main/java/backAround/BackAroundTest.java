package backAround;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 12/09/18.
 */
public class BackAroundTest {

    @Test
    public void shouldReturnLastCharAddedAtFirstAndTheEndOfTheString(){
        String str = "cat", strEspected = "tcatt";
        Assert.assertEquals(Main.backAround(str), strEspected);
    }
}
