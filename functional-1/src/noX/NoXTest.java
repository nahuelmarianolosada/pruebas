package noX;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nlosada on 06/12/18.
 */
public class NoXTest {
    @Test
    public void shouldReturnStringsAsLowerCase(){
        Assert.assertThat(Main.noX(Arrays.asList(new String[]{})), CoreMatchers.hasItems());
        Assert.assertThat(Main.noX(Arrays.asList(new String[]{"ax", "bb", "cx"})), CoreMatchers.hasItems("a", "bb", "c"));
        Assert.assertThat(Main.noX(Arrays.asList(new String[]{"xxax", "xbxbx", "xxcx"})), CoreMatchers.hasItems("a", "bb", "c"));
        Assert.assertThat(Main.noX(Arrays.asList(new String[]{"x"})), CoreMatchers.hasItems(""));
        Assert.assertThat(Main.noX(Arrays.asList(new String[]{"the", "taxi"})), CoreMatchers.hasItems("the", "tai"));
        Assert.assertThat(Main.noX(Arrays.asList(new String[]{"the", "xxtxaxixxx"})), CoreMatchers.hasItems("the", "tai"));
        Assert.assertThat(Main.noX(Arrays.asList(new String[]{"this", "is", "the", "x"})), CoreMatchers.hasItems("this", "is", "the", ""));
    }
}
