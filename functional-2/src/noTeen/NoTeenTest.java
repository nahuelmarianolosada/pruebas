package noTeen;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nlosada on 06/12/18.
 */
public class NoTeenTest {

    @Test
    public void shouldRemoveIntegersBetween13And19Inclusive(){
        Assert.assertThat(Main.noTeen(Arrays.asList(new Integer[]{12, 13, 19, 20})), CoreMatchers.hasItems(12, 20));
        Assert.assertThat(Main.noTeen(Arrays.asList(new Integer[]{1, 14, 1})), CoreMatchers.hasItems(1, 1));
        Assert.assertThat(Main.noTeen(Arrays.asList(new Integer[]{15})), CoreMatchers.hasItems());
        Assert.assertThat(Main.noTeen(Arrays.asList(new Integer[]{})), CoreMatchers.hasItems());
        Assert.assertThat(Main.noTeen(Arrays.asList(new Integer[]{0, 1, 2, -3})), CoreMatchers.hasItems(0, 1, 2, -3));
        Assert.assertThat(Main.noTeen(Arrays.asList(new Integer[]{15, 17, 19, 21, 19})), CoreMatchers.hasItems(21));
        Assert.assertThat(Main.noTeen(Arrays.asList(new Integer[]{-16, 2, 15, 3, 16, 25})), CoreMatchers.hasItems(-16, 2, 3, 25));
    }
}
