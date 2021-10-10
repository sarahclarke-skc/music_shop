package instrumentsTests;

import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone(499.00, 699.00, "woodwind", "Buffet", "100 Series", "alto");
    }

    @Test
    public void hasSaxType() {
        assertEquals("alto", saxophone.getSaxType());
    }

    @Test
    public void canChangeSaxType() {
        saxophone.setSaxType("soprano");
        assertEquals("soprano", saxophone.getSaxType());
    }

    @Test
    public void canPlay() {
        assertEquals("I'm a saxophone", saxophone.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(200.00, saxophone.calculateMarkUp(), 0.001);
    }
}
