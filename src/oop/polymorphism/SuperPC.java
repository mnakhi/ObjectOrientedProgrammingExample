package oop.polymorphism;

public class SuperPC extends PC{
    public int pcChoice(String pcSize, String pcName, String pcRAM, int pcPrice){
        System.out.println("Information: "+pcName+ " "+ pcSize + " inch, "+ pcRAM + " price is "+(pcPrice-100));
        return pcPrice;
    }
}
