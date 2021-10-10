package instrumentsTests;

import instruments.Instrument;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument;
    Saxophone saxophone;

    @Before
    public void before() {
        instrument = new Saxophone(499.00, 699.00, "woodwind", "Buffet", "100 Series", "alto");
    }

    @Test
    public void hasWholeSalePrice() {
        assertEquals(499.00, instrument.getWholeSalePrice(), 0.001);
    }

    @Test
    public void canChangeWholeSalePrice() {
        instrument.setWholeSalePrice(350.00);
        assertEquals(350.00, instrument.getWholeSalePrice(), 0.001);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(699.00, instrument.getSalePrice(), 0.001);
    }

    @Test
    public void canChangeSalePrice() {
        instrument.setSalePrice(800.00);
        assertEquals(800.00, instrument.getSalePrice(), 0.001);
    }

    @Test
    public void hasCategory() {
        assertEquals("woodwind", instrument.getCategory());
    }

    @Test
    public void hasBrand() {
        assertEquals("Buffet", instrument.getBrand());
    }

    @Test
    public void canChangeBrand() {
        instrument.setBrand("Yamaha");
        assertEquals("Yamaha", instrument.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("100 Series", instrument.getModel());
    }

    @Test
    public void canChangeModel() {
        instrument.setModel("400 Series");
        assertEquals("400 Series", instrument.getModel());
    }

    @Test
    public void objectRemembersItsType() {
        instrument = new Saxophone(499.00, 699.00, "woodwind", "Buffet", "100 Series", "alto");;
        Saxophone saxophone = (Saxophone) instrument;
        assertEquals("alto", saxophone.getSaxType());
    }

}
