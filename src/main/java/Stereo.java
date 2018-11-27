public class Stereo {
    private String name;
    private CDPlayer cdPlayer;
    private Radio radio;
    private RecordDeck recordDeck;

    public Stereo(String name, CDPlayer cdPlayer, Radio radio, RecordDeck recordDeck) {
        this.name = name;
        this.cdPlayer = cdPlayer;
        this.radio = radio;
        this.recordDeck = recordDeck;
    }

    public String getName() {
        return this.name;
    }

    public CDPlayer getCDPlayer() {
        return this.cdPlayer;
    }

    public Radio getRadio() {
        return this.radio;
    }

    public RecordDeck getRecordDeck() {
        return this.recordDeck;
    }

    public String tuneRadio(String radioStation){
        return this.radio.tune(radioStation);
    }

    public String playCD(String cdName){
        return this.cdPlayer.play(cdName);
    }

    public String playRecord(String recordName) {
        return this.recordDeck.play(recordName);
    }
}
