package doubling;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nlosada on 05/12/18.
 */
public class DoublingTest {
    @Test
    public void shouldReturnExactlyDouble(){
        Assert.assertThat(Main.doubling(Arrays.asList(new Integer[]{1,2,3})), CoreMatchers.hasItems(2,4,6));
        Assert.assertThat(Main.doubling(Arrays.asList(new Integer[]{6, 8, 6, 8, -1})), CoreMatchers.hasItems(12, 16, 12, 16, -2));
        Assert.assertThat(Main.doubling(Arrays.asList(new Integer[]{})), CoreMatchers.hasItems());
        Assert.assertThat(Main.doubling(Arrays.asList(new Integer[]{5})), CoreMatchers.hasItems(10));
        Assert.assertThat(Main.doubling(Arrays.asList(new Integer[]{5, 10})), CoreMatchers.hasItems(10, 20));
        Assert.assertThat(Main.doubling(Arrays.asList(new Integer[]{8, -5, 7, 3, 109})), CoreMatchers.hasItems(16, -10, 14, 6, 218));
        Assert.assertThat(Main.doubling(Arrays.asList(new Integer[]{6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2})), CoreMatchers.hasItems(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4));
        Assert.assertThat(Main.doubling(Arrays.asList(new Integer[]{3, 1, 4, 1, 5, 9})), CoreMatchers.hasItems(6, 2, 8, 2, 10, 18));
    }
}
