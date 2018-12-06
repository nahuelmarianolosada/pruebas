package math1;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nlosada on 06/12/18.
 */
public class Math1Test {
    @Test
    public void shouldReturnEachNumberPlus1AndMultipliedBy10() {
        Assert.assertThat(Main.math1(Arrays.asList(new Integer[]{1, 2, 3})), CoreMatchers.hasItems(20, 30, 40));
        Assert.assertThat(Main.math1(Arrays.asList(new Integer[]{6, 8, 6, 8, 1})), CoreMatchers.hasItems(70, 90, 70, 90, 20));
        Assert.assertThat(Main.math1(Arrays.asList(new Integer[]{10})), CoreMatchers.hasItems(110));
        Assert.assertThat(Main.math1(Arrays.asList(new Integer[]{})), CoreMatchers.hasItems());
        Assert.assertThat(Main.math1(Arrays.asList(new Integer[]{5, 10})), CoreMatchers.hasItems(60, 110));
        Assert.assertThat(Main.math1(Arrays.asList(new Integer[]{-1, -2, -3, -2, -1})), CoreMatchers.hasItems(0, -10, -20, -10, 0));
        Assert.assertThat(Main.math1(Arrays.asList(new Integer[]{6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2})), CoreMatchers.hasItems(70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30));
    }
}
