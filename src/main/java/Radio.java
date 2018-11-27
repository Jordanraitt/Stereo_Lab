public class Radio extends Component {

    public Radio(String make, String model) {
        super(make, model);
    }

    public String tune(String station) {
        return "Now on station " + station;
    }
}



//    Create classes for different components e.g. record deck, CD player etc. Each class will have instance variables particular to that component e.g. a record deck may have IPlay speeds, a CD player may have a number of CDs it can IPlay at a time (think of the old-fashioned multi-changers). As the stereo is made up of separate components, each component should have its own make and model, and methods to operate them e.g. a CD player might have a IPlay method. (If different components have the same methods then this might suggest that they implement the same interface);