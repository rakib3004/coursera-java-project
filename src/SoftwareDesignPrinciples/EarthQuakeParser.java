package SoftwareDesignPrinciples;

import java.util.ArrayList;

public class EarthQuakeParser {

    public EarthQuakeParser() {
    }

    public ArrayList<QuakeEntry> read(String sourceInfo){
         ArrayList<QuakeEntry> quakeEntryArrayList = null;
        Filter filter = new MinMagFilter(4.0);
        ArrayList<QuakeEntry> largeQuakes = filter(quakeEntryArrayList,filter);
        QuakeEntry.Location myLocation = new QuakeEntry.Location(45.2,88.96);

    /*    filter = new DistanceFilter(myLocation,100);
        ArrayList<QuakeEntry> shallowQuakes  = filter(quakeEntryArrayList,filter);*/
        return quakeEntryArrayList;
    }
    public ArrayList<QuakeEntry> filterByMagnitude(ArrayList<QuakeEntry> quakeData, double minimumMagnitude){
ArrayList<QuakeEntry> answer=  new ArrayList<QuakeEntry>();
for(QuakeEntry quakeEntry : quakeData ){
    if(quakeEntry.getMagnitude()>=minimumMagnitude){
        answer.add(quakeEntry);
    }
}
return answer;
    }
    public  ArrayList<QuakeEntry> filterByDistanceFrom(ArrayList<QuakeEntry> quakeData,
                                                       double maximumDistance, QuakeEntry.Location
                                                               from){
        ArrayList<QuakeEntry> answer = new ArrayList<QuakeEntry>();
        for(QuakeEntry quakeEntryData : quakeData){
           /* if(quakeEntryData.getMyLocation(from)*//*.distanceTo(from)*//*<=maximumDistance){
                answer.add(quakeEntryData);
            }*/
        }
        return  answer;
    }
    public ArrayList<QuakeEntry> filter(ArrayList<QuakeEntry> quakeData,Filter filter){
        ArrayList<QuakeEntry> answer = new ArrayList<QuakeEntry>();
        for (QuakeEntry quakeEntry : quakeData){
            if(filter.satisfies(quakeEntry)){
                answer.add(quakeEntry);
            }
        }
        return  answer;
    }
}
