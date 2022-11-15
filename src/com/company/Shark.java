package com.company;

public class Shark extends Animal {
    public Shark[] sharks = new Shark[5];
    public String attack (String ocean) {
        ocean = "King of the Ocean !!!";
        return ocean;
    }
    public void attacks() {
        System.out.println("King of the Ocean !!!");
    }
}
