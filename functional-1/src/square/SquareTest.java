package square;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nlosada on 05/12/18.
 */
public class SquareTest {
    @Test
    public void shouldReturnIntegersMultipliedWithItself(){
        Assert.assertThat(Main.square(Arrays.asList(new Integer[]{1,2,3})), CoreMatchers.hasItems(1,4,9));
        Assert.assertThat(Main.square(Arrays.asList(new Integer[]{6, 8, -6, -8, -1})), CoreMatchers.hasItems(36, 64, 36, 64, 1));
        Assert.assertThat(Main.square(Arrays.asList(new Integer[]{})), CoreMatchers.hasItems());
        Assert.assertThat(Main.square(Arrays.asList(new Integer[]{5})), CoreMatchers.hasItems(25));
        Assert.assertThat(Main.square(Arrays.asList(new Integer[]{5, 10})), CoreMatchers.hasItems(25, 100));
        Assert.assertThat(Main.square(Arrays.asList(new Integer[]{8, -5, 7, 3, 109})), CoreMatchers.hasItems(64, 25, 49, 9, 11881));
        Assert.assertThat(Main.square(Arrays.asList(new Integer[]{0, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2})), CoreMatchers.hasItems(0, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4));
        Assert.assertThat(Main.square(Arrays.asList(new Integer[]{3, 1, 4, 1, 5, 9})), CoreMatchers.hasItems(9, 1, 16, 1, 25, 81));
    }
}
