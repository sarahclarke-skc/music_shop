package instrumentsTests;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(10000.00, 16000.00, "percussion", "Steinway & Sons", "K-52");
    }

    @Test
    public void canPlay() {
        assertEquals("I'm a piano", piano.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(6000.00, piano.calculateMarkUp(), 0.001);
    }
}

