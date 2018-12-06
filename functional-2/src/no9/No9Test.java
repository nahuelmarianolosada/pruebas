package no9;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nlosada on 06/12/18.
 */
public class No9Test {
    @Test
    public void shouldRemoveIntegersThatEndsWith9() {
        Assert.assertThat(Main.no9(Arrays.asList(new Integer[]{1, 2, 19})), CoreMatchers.hasItems(1, 2));
        Assert.assertThat(Main.no9(Arrays.asList(new Integer[]{9, 19, 29, 3})), CoreMatchers.hasItems(3));
        Assert.assertThat(Main.no9(Arrays.asList(new Integer[]{1, 2, 3})), CoreMatchers.hasItems(1, 2, 3));
        Assert.assertThat(Main.no9(Arrays.asList(new Integer[]{45, 99, 90, 28, 13, 999, 0})), CoreMatchers.hasItems(45, 90, 28, 13, 0));
        Assert.assertThat(Main.no9(Arrays.asList(new Integer[]{})), CoreMatchers.hasItems());
        Assert.assertThat(Main.no9(Arrays.asList(new Integer[]{9})), CoreMatchers.hasItems());
        Assert.assertThat(Main.no9(Arrays.asList(new Integer[]{0, 9, 0})), CoreMatchers.hasItems(0, 0));
    }
}
