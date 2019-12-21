package oop.abstruction;

public class MyHouse extends Quality implements House, AdditionalProperty {


    public void rooms() {
        System.out.println("It must have rooms");
    }


    public void airCondition() {
        System.out.println("It must have air-conditioning");
    }


    public void heatingSystem() {
        System.out.println("It must have heating system");
    }


    public void internetConnection() {
        System.out.println("This house has strong internet connection");
    }


    public void security() {
        System.out.println("Must have surveillance camera");
    }
}
