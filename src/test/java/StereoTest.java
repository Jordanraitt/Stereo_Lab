import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CDPlayer cdPlayer;
    Radio radio;
    RecordDeck recordDeck;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sonos", "DiskPlayer");
        radio = new Radio("Sony", "D500");
        recordDeck = new RecordDeck("Bush", "Retro");
        stereo = new Stereo("Jordan", cdPlayer, radio, recordDeck);
    }

    @Test
    public void hasName(){
        assertEquals("Jordan", stereo.getName());
    }

    @Test
    public void hasRadio(){
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void hasRecordDeck(){
        assertEquals(recordDeck, stereo.getRecordDeck());
    }

    @Test
    public void hasCDPlayer() {
        assertEquals(cdPlayer, stereo.getCDPlayer());
    }

    @Test
    public void canAccessClassGetterMethods () {
        assertEquals("Sonos", stereo.getCDPlayer().getMake() );
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Now on station Radio 1", stereo.tuneRadio("Radio 1"));
    }

    @Test
    public void canPlayCD() {
        assertEquals("Now playing Awaken My Love!", stereo.playCD("Awaken My Love"));
    }

    @Test
    public void canPlayRecord() {
        assertEquals("crackle... Now playing Camp!", stereo.playRecord("Camp"));
    }
}
