import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before() {
        recordDeck = new RecordDeck("Bush", "Retro");
    }

    @Test
    public void hasMake() {
        assertEquals("Bush", recordDeck.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Retro", recordDeck.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("crackle... Now playing Camp!", recordDeck.play("Camp"));
    }
}
