package addStar;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nlosada on 05/12/18.
 */
public class AddStarTest {
    @Test
    public void shouldReturnExactlyDouble(){
        Assert.assertThat(Main.addStar(Arrays.asList(new String[]{})), CoreMatchers.hasItems());
        Assert.assertThat(Main.addStar(Arrays.asList(new String[]{"a","bb","ccc"})), CoreMatchers.hasItems("a*","bb*","ccc*"));
        Assert.assertThat(Main.addStar(Arrays.asList(new String[]{"hello", "there"})), CoreMatchers.hasItems("hello*","there*"));
        Assert.assertThat(Main.addStar(Arrays.asList(new String[]{"*"})), CoreMatchers.hasItems("**"));
        Assert.assertThat(Main.addStar(Arrays.asList(new String[]{"empty", "string",""})), CoreMatchers.hasItems("empty*", "string*","*"));
        Assert.assertThat(Main.addStar(Arrays.asList(new String[]{"kittens", "and", "chocolate", "and"})), CoreMatchers.hasItems("kittens*", "and*", "chocolate*", "and*"));
    }
}
