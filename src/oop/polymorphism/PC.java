package oop.polymorphism;

public class PC {

    public int pcChoice(String pcName, int pcPrice){
        System.out.println(pcName+ " price is "+pcPrice);
        return pcPrice;
    }
    public int pcChoice(String pcSize, String pcName, int pcPrice){
        System.out.println(pcSize +" inch "+ pcName + " price is "+ pcPrice);
        return pcPrice;
    }
    public int pcChoice(String pcSize, String pcName, String pcRAM, int pcPrice){
        System.out.println(pcName+ " "+ pcSize + " inch, "+ pcRAM + " price is "+pcPrice);
        return pcPrice;
    }

}
