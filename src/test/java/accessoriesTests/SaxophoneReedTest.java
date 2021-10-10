package accessoriesTests;

import accessories.SaxophoneReed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneReedTest {

    SaxophoneReed saxophoneReed;

    @Before
    public void before() {
        saxophoneReed = new SaxophoneReed(5.00, 10.00, "alto");
    }

    @Test
    public void hasSaxReedType() {
        assertEquals("alto", saxophoneReed.getSaxReedType());
    }

    @Test
    public void canChangeSaxReedType() {
        saxophoneReed.setSaxReedType("tenor");
        assertEquals("tenor", saxophoneReed.getSaxReedType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5.00, saxophoneReed.calculateMarkUp(), 0.001);
    }
}
