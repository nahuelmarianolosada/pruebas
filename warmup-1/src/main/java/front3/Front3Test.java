package front3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nlosada on 12/09/18.
 */
public class Front3Test {

    @Test
    public void shouldReturnThe3FirstCharsOfTheString(){
        Assert.assertEquals(Main.front3("Java"), "JavJavJav");
        Assert.assertEquals(Main.front3("abc"), "abcabcabc");
    }

    @Test
    public void shouldReturnTheSameStringIfTheLengthIsLessThanThree(){
        String strLessThanThree = "uy";
        Assert.assertEquals(Main.front3(strLessThanThree), strLessThanThree+strLessThanThree+strLessThanThree);
    }
}
