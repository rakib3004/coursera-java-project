package SoftwareDesignPrinciples;

public class QuakeEntry {

    private Location myLocation;
    private String title;
    private double depth;
    private double magnitude;
    public QuakeEntry() {
    }
    public QuakeEntry(Location myLocation, String title, double depth, double magnitude) {
        this.myLocation = myLocation;
        this.title = title;
        this.depth = depth;
        this.magnitude = magnitude;
    }

}
