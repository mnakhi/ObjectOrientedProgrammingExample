package oop.abstruction;

public class TestMyHouse {
    public static void main(String[] args) {
        MyHouse house1 = new MyHouse();
        house1.airCondition();
        house1.internetConnection();
        house1.alarmSystem();
        house1.security();


        House house2 = new MyHouse();
        house2.airCondition();
        house2.rooms();
        house2.heatingSystem();



        MyHouse house3 = new MyHouse();
        house3.dimension();

        House house4 = new MyHouse(); //here type of the variable is House interface
        house4.heatingSystem();


    }
}
