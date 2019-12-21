package staticNonstatic;


/*/
Non static variable belongs to object
 */
public class TestDriveWay {
    public static void main(String[] args) {
        Driveway katie = new Driveway();
        katie.setDriveWaySize(5);
        System.out.println("Katie's driveway size: "+katie.getDriveWaySize());


        Driveway mike = new Driveway();
        mike.setDriveWaySize(6);
        System.out.println("Mike's driveway size: "+mike.getDriveWaySize());
        System.out.println("Katie's driveway size: "+katie.getDriveWaySize());
        Driveway.buildDriveway();
    }
}
