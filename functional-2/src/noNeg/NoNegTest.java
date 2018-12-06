package noNeg;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nlosada on 06/12/18.
 */
public class NoNegTest {

    @Test
    public void shouldRemoveIntegersLowerThan0(){
        Assert.assertThat(Main.noNeg(Arrays.asList(new Integer[]{1, -2})), CoreMatchers.hasItems(1));
        Assert.assertThat(Main.noNeg(Arrays.asList(new Integer[]{-3, -3, 3, 3})), CoreMatchers.hasItems(3, 3));
        Assert.assertThat(Main.noNeg(Arrays.asList(new Integer[]{-1, -1, -1})), CoreMatchers.hasItems());
        Assert.assertThat(Main.noNeg(Arrays.asList(new Integer[]{})), CoreMatchers.hasItems());
        Assert.assertThat(Main.noNeg(Arrays.asList(new Integer[]{0, 1, 2})), CoreMatchers.hasItems(0, 1, 2));
        Assert.assertThat(Main.noNeg(Arrays.asList(new Integer[]{3, -10, 1, -1, 4, -400})), CoreMatchers.hasItems(3, 1, 4));
        Assert.assertThat(Main.noNeg(Arrays.asList(new Integer[]{-1, 3, 1, -1, -10, -100, -111, 5})), CoreMatchers.hasItems(3, 1, 5));
    }
}
