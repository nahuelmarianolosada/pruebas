package copies3;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nlosada on 05/12/18.
 */
public class Copies3Test {
    @Test
    public void shouldReturn3TimesEachString(){
        Assert.assertThat(Main.copies3(Arrays.asList(new String[]{})), CoreMatchers.hasItems());
        Assert.assertThat(Main.copies3(Arrays.asList(new String[]{"a","bb","ccc"})), CoreMatchers.hasItems("aaa", "bbbbbb", "ccccccccc"));
        Assert.assertThat(Main.copies3(Arrays.asList(new String[]{"24","a",""})), CoreMatchers.hasItems("242424", "aaa", ""));
        Assert.assertThat(Main.copies3(Arrays.asList(new String[]{"no"})), CoreMatchers.hasItems("nonono"));
        Assert.assertThat(Main.copies3(Arrays.asList(new String[]{"this", "and", "that", "and"})), CoreMatchers.hasItems("thisthisthis", "andandand", "thatthatthat", "andandand"));
    }
}
