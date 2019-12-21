package oop.abstruction;

public abstract class Quality implements HouseMeasurements{
    public void alarmSystem(){
        System.out.println("It's good to have alarm system");
    }
    public abstract void internetConnection();
    public int dimension(){
        int d = 70;
        System.out.println("The house dimension is "+d + " square feet");
        return d;
    }

}
