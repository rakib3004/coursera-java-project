package SoftwareDesignPrinciples;

import java.util.ArrayList;

public class EarthQuakeParser {

    public EarthQuakeParser() {
    }

    public ArrayList<QuakeEntry> read(String sourceInfo){
         ArrayList<QuakeEntry> quakeEntryArrayList = null;
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
}
