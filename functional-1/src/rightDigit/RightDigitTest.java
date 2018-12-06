package rightDigit;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nlosada on 06/12/18.
 */
public class RightDigitTest {
    @Test
    public void shouldReturnTheRightmostDigits() {
        Assert.assertThat(Main.rightDigit(Arrays.asList(new Integer[]{1, 22, 93})), CoreMatchers.hasItems(1, 2, 3));
        Assert.assertThat(Main.rightDigit(Arrays.asList(new Integer[]{16, 8, 886, 8, 1})), CoreMatchers.hasItems(6, 8, 6, 8, 1));
        Assert.assertThat(Main.rightDigit(Arrays.asList(new Integer[]{10, 0})), CoreMatchers.hasItems(0, 0));
        Assert.assertThat(Main.rightDigit(Arrays.asList(new Integer[]{})), CoreMatchers.hasItems());
        Assert.assertThat(Main.rightDigit(Arrays.asList(new Integer[]{5, 10})), CoreMatchers.hasItems(5, 0));
        Assert.assertThat(Main.rightDigit(Arrays.asList(new Integer[]{5, 50, 500, 5000, 5000})), CoreMatchers.hasItems(5, 0, 0, 0, 0));
        Assert.assertThat(Main.rightDigit(Arrays.asList(new Integer[]{6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2})), CoreMatchers.hasItems(6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2));
    }
}
