import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {

    MP3Player mp3Player;
    Stereo stereo;
    CDPlayer cdPlayer;
    Radio radio;
    RecordDeck recordDeck;

    @Before
    public void before() {
        mp3Player = new MP3Player("Apple", "iPod");
        cdPlayer = new CDPlayer("Sonos", "DiskPlayer");
        radio = new Radio("Sony", "D500");
        recordDeck = new RecordDeck("Bush", "Retro");
        stereo = new Stereo("Jordan", cdPlayer, radio, recordDeck);
    }

    @Test
    public void hasMake(){
        assertEquals("Apple", mp3Player.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("iPod", mp3Player.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("Now playing Redbone!", mp3Player.play("Redbone") );
    }

    @Test
    public void canConnect() {
        assertEquals("Now connected to Jordan", mp3Player.connect(stereo));
    }

    @Test
    public void canConnectedAndPlay() {
        assertEquals("Now connected to Jordan & Now playing Redbone!", mp3Player.connectAndPlay(stereo, "Redbone"));
    }

}
