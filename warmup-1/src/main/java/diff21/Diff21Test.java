package diff21;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by nlosada on 11/09/18.
 */
public class Diff21Test {

    @Test
    public void shouldReturnDiffIfNumberIsLessThan21(){
        assertEquals(Main.diff21(19), 2);
    }

    @Test
    public void shouldReturnDoubleDiffIfNumberIsMoreThan21(){
        assertEquals(Main.diff21(23), 4);
    }
}
