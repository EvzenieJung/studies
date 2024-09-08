package interview3;

public class Ship {

    private int id;
    private int counter = 1;
    private String stringRepresentation;
    private long slotsInUse;
    private long freeSlots;

    public Ship(String stringRepresentation, long freeSlots, long slotsInUse) {
        this.id = counter++;
        this.stringRepresentation = stringRepresentation;
        this.freeSlots = freeSlots;
        this.slotsInUse = slotsInUse;
    }

    public String getStringRepresentation() {
        return stringRepresentation;
    }

    public void setStringRepresentation(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    public long getSlotsInUse() {
        return slotsInUse;
    }

    public void setSlotsInUse(long slotsInUse) {
        this.slotsInUse = slotsInUse;
    }

    public long getFreeSlots() {
        return freeSlots;
    }

    public void setFreeSlots(long freeSlots) {
        this.freeSlots = freeSlots;
    }

    public long getTotalSlots() {
        return slotsInUse + freeSlots;
    }
}
