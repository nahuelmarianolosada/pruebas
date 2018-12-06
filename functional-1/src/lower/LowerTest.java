package lower;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nlosada on 05/12/18.
 */
public class LowerTest {
    @Test
    public void shouldReturnStringsAsLowerCase(){
        Assert.assertThat(Main.lower(Arrays.asList(new String[]{"Hello", "Hi"})), CoreMatchers.hasItems("hello", "hi"));
        Assert.assertThat(Main.lower(Arrays.asList(new String[]{"AAA", "BBB", "ccc"})), CoreMatchers.hasItems("aaa", "bbb", "ccc"));
        Assert.assertThat(Main.lower(Arrays.asList(new String[]{"KitteN", "ChocolaTE"})), CoreMatchers.hasItems("kitten", "chocolate"));
        Assert.assertThat(Main.lower(Arrays.asList(new String[]{})), CoreMatchers.hasItems());
        Assert.assertThat(Main.lower(Arrays.asList(new String[]{"EMPTY", ""})), CoreMatchers.hasItems("empty", ""));
        Assert.assertThat(Main.lower(Arrays.asList(new String[]{"aaX", "bYb", "Ycc", "ZZZ"})), CoreMatchers.hasItems("aax", "byb", "ycc", "zzz"));
    }
}
