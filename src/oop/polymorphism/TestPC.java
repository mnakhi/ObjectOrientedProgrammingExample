package oop.polymorphism;

public class TestPC {
    public static void main(String[] args) {
        PC pc1 = new PC();
        pc1.pcChoice("HP",1000);

        PC pc2 = new PC();
        pc2.pcChoice("13","DELL","16GB",1800);
        SuperPC pc = new SuperPC();
        pc.pcChoice("13","DELL","16GB",1800);

    }
}
