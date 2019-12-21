package staticNonstatic;

public class Driveway {
    static int driveWaySize;



    public void setDriveWaySize(int driveWaySize) {
        this.driveWaySize = driveWaySize;
    }
    public int getDriveWaySize() {
        return driveWaySize;
    }
    public static void buildDriveway(){
        System.out.println("Let's build a driveway");
    }
}
