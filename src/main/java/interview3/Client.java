package interview3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    private static final String OCEAN = "<NNNN_^_> <>< ~ ~><>~ <^> ><> <><  <NN__^_>  ~ <>< <^> <>< ~ <_^>   <^N> ><>  ~><>~ <>< ~ ><><N^NNNN>";

    public static void main(String[] args) {
        oceanTask(OCEAN);
    }
    /**
     * Task:     * <ol>
     * <li>Create a <b>Ship</b> class that contains the following attributes:     * <ul>
     * <li><b>id</b> (must be <u>unique</u>, data type is up to you)</li>     * <li><b>stringRepresentation</b> (copy of the ship string)</li>
     * <li><b>freeSlots</b> (available container slots (long))</li>     * <li><b>slotsInUse</b> (container slots in use (long))</li>
     * </ul>     * </li>
     * <li>Extract the <u>valid</u> ships from the ocean string and put them into a collection of <b>Ship</b> objects     * <ul>
     * <li>A <b>Ship</b> starts and ends with angle brackets <b>{@literal <>}</b></li>     * <li>It <u>must</u> have one vessel bridge represented as <b>^</b></li>
     * <li>It can contain containers that are represented as <b>N</b></li>     * <li>It can contain empty slots that are represented as <b>_</b></li>
     * <li>Examples:</li>     * <ul>
     * <li style="color:#3cb371;list-style-type: none;">Valid Ships: {@literal <NN__^> <_^___> <N^N>}</li>     * <li style="color:#ff6347;list-style-type: none;">Invalid Ships: {@literal <> < ~ ~> <~^_N> <N_>}</li>
     * </ul>     * </ul>
     * </li>     * <li>Sort the collection by the number of <u>total slots</u> in ascending order</li>
     * <li>Print the ships like:     * <ul>
     * <li style="list-style-type: none;">{@literal <Ship representation> -> <used slots>/<total slots>}</li>     * <li style="list-style-type: none;">e.g: {@literal  <N^_> -> 1/2}</li>
     * </ul>     * </li>
     * </ol>     */
    public static void oceanTask(String ocean) {
        List<Ship> ships = new ArrayList<>();
        Pattern pattern = Pattern.compile("<[N^_]+>");
        Pattern pattern1 = Pattern.compile("<[N_^]+>");

        Matcher matcher = pattern1.matcher(ocean);
        while (matcher.find()) {
            String representation = matcher.group();
            long freeSlots = representation.chars().filter(ch -> ch == '_').count();
            long slotsInUse = representation.chars().filter(ch -> ch == 'N').count();
            Ship ship = new Ship(representation, freeSlots, slotsInUse);
            ships.add(ship);
        }
        ships.sort(Comparator.comparingLong(Ship::getTotalSlots));
        ships.forEach(ship -> System.out.println(ship.getStringRepresentation() + " -> " + ship.getSlotsInUse() + "/" + ship.getTotalSlots()));
    }
}
