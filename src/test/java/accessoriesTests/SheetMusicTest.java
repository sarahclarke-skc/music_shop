package accessoriesTests;

import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Piano Sonata No. 2 in B-Flat Minor", "Sergei Rachmaninoff", 3.00, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Piano Sonata No. 2 in B-Flat Minor", sheetMusic.getName());
    }

    @Test
    public void canChangeName() {
        sheetMusic.setName("Moonlight Sonata");
        assertEquals("Moonlight Sonata", sheetMusic.getName());
    }

    @Test
    public void hasComposer() {
        assertEquals("Sergei Rachmaninoff", sheetMusic.getComposer());
    }

    @Test
    public void canChangeComposer() {
        sheetMusic.setComposer("Ludwig Beethoven");
        assertEquals("Ludwig Beethoven", sheetMusic.getComposer());
    }

    @Test
    public void canChangeSalePrice() {
        sheetMusic.setSalePrice(11.00);
        assertEquals(11.00, sheetMusic.getSalePrice(), 0.001);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(7.00, sheetMusic.calculateMarkUp(), 0.001);
    }
}
