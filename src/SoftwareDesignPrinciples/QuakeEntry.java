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
    public QuakeEntry(double lat, double lon, double magnitude, String title, double depth) {
        this.myLocation = new Location(lat,lon);
        this.title = title;
        this.depth = depth;
        this.magnitude = magnitude;
    }

    public Location getMyLocation() {
        return myLocation;
    }

    public void setMyLocation(Location myLocation) {
        this.myLocation = myLocation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public static class Location {
        private double lat;
        private double lon;

        public Location(double lat, double lon) {
            this.lat = lat;
            this.lon = lon;
        }
    }
}
