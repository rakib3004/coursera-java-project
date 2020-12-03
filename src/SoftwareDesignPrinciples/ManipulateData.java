package SoftwareDesignPrinciples;

import java.util.ArrayList;

public class ManipulateData {
    public void createCSV(){
EarthQuakeParser earthQuakeParser = new EarthQuakeParser();
String sourceInfo = "http://earthquake.usgs.gov";
        ArrayList<QuakeEntry> quakeEntryArrayList = earthQuakeParser.read(sourceInfo);
        dumpCSV(quakeEntryArrayList);
        System.out.println("# Quakes read : "+quakeEntryArrayList.size());
    }
    public void dumpCSV(ArrayList<QuakeEntry> quakeEntryArrayList){

    }
}
