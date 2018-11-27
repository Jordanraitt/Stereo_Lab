public class RecordDeck extends Component implements IPlay {

    public RecordDeck (String make, String model) {
        super(make, model);
    }

    public String play(String albumName) {
        return "crackle... Now playing " + albumName + "!";
    }
}
