package moreY;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nlosada on 06/12/18.
 */
public class MoreYTest {
    @Test
    public void shouldReturnEachStringWithAnYatFirstAndAtEnd() {
        Assert.assertThat(Main.moreY(Arrays.asList(new String[]{"a", "b", "c"})), CoreMatchers.hasItems("yay", "yby", "ycy"));
        Assert.assertThat(Main.moreY(Arrays.asList(new String[]{"hello", "there"})), CoreMatchers.hasItems("yhelloy", "ytherey"));
        Assert.assertThat(Main.moreY(Arrays.asList(new String[]{"yay"})), CoreMatchers.hasItems("yyayy"));
        Assert.assertThat(Main.moreY(Arrays.asList(new String[]{"", "a", "xx"})), CoreMatchers.hasItems("yy", "yay", "yxxy"));
        Assert.assertThat(Main.moreY(Arrays.asList(new String[]{})), CoreMatchers.hasItems());
        Assert.assertThat(Main.moreY(Arrays.asList(new String[]{"xx", "yy", "zz"})), CoreMatchers.hasItems("yxxy", "yyyy", "yzzy"));
    }
}
