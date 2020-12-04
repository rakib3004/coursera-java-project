package SoftwareDesignPrinciples;

public class MinMagFilter implements Filter{
    private double magMin;

    public MinMagFilter(double magMin) {
        this.magMin = magMin;
    }
    public boolean satisfies(QuakeEntry quakeEntry){
        return  quakeEntry.getMagnitude()>=magMin;
    }


}
