package instrumentsTests;

import instruments.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void before() {
        clarinet = new Clarinet(3000.00, 3600.00, "woodwind", "Buffet", "Vintage", "B flat");
    }

    @Test
    public void hasClarinetType() {
        assertEquals("B flat", clarinet.getClarinetType());
    }

    @Test
    public void canChangeClarinetType() {
        clarinet.setClarinetType("E flat");
        assertEquals("E flat", clarinet.getClarinetType());
    }

    @Test
    public void canPlay() {
        assertEquals("I'm a clarinet", clarinet.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(600.00, clarinet.calculateMarkUp(), 0.001);
    }
}