import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Sony", "D500");
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("D500", radio.getModel());
    }

    @Test
    public void canTune () {
        String tune = radio.tune("Radio One");
        assertEquals("Now on station Radio One", tune);
    }
}

