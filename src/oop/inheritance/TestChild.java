package oop.inheritance;

public class TestChild {
    public static void main(String[] args) {
        Child ch1 = new Child();
        ch1.occupation();
        ch1.physicalFeature();

        Parent p1 = new Parent();
        p1.occupation();
    }
}
