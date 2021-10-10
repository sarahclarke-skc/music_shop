import accessories.SheetMusic;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    SheetMusic sheetMusic;
    Piano piano;

    @Before
    public void before() {
        musicShop = new MusicShop("Windstruments", 15000.00);
        sheetMusic = new SheetMusic("Piano Sonata No. 2 in B-Flat Minor", "Sergei Rachmaninoff", 3.00, 10.00);
        piano = new Piano(10000.00, 16000.00, "percussion", "Steinway & Sons", "K-52");

    }

    @Test
    public void hasName() {
        assertEquals("Windstruments", musicShop.getName());
    }

    @Test
    public void hasTill() {
        assertEquals(15000.00, musicShop.getTill(), 0.001);
    }

    @Test
    public void startsWithZeroStock() {
        assertEquals(0, musicShop.getStock());
    }

    @Test
    public void canAddInstrumentToStock() {
        musicShop.addItem(piano);
        assertEquals(1, musicShop.getStock());
    }

    @Test
    public void canAddAccessoryToStock() {
        musicShop.addItem(sheetMusic);
        musicShop.addItem(sheetMusic);
        assertEquals(2, musicShop.getStock());
    }

    @Test
    public void canCalculateProfit() {
        musicShop.addItem(piano);
        musicShop.addItem(sheetMusic);
        assertEquals(6007, musicShop.calculateProfit(), 0.001);
    }
}
