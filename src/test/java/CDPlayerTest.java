import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sonos", "DiskPlayer");
    }

    @Test
    public void hasMake() {
        assertEquals("Sonos", cdPlayer.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("DiskPlayer", cdPlayer.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("Now playing Awaken My Love!", cdPlayer.play("Awaken My Love"));
    }
}
