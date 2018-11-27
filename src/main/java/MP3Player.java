public class MP3Player extends Component implements IPlay, IConnect {

    public MP3Player(String make, String model){
        super(make, model);
    };


    public String play(String songName) {
        return "Now playing " + songName + "!";
    }

    public String connect(Stereo stereo) {
        return "Now connected to " + stereo.getName();
    }

    public String connectAndPlay(Stereo stereo, String songName) {
        return this.connect(stereo) + " & " + this.play(songName);
    }

}
