public class CDPlayer extends Component implements IPlay {

    public CDPlayer(String make, String model) {
        super(make, model);
    }

    public String play(String albumName) {
        return "Now playing " + albumName + "!";
    }

}
