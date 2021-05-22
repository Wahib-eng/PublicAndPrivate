package com.withWahib;

public class C1 {
    public int x=9;
    int y=2;
    private int z=1;
    public void m1(){
        System.out.println("Printing X from C1 class Public decalration , \n x = "+ x+"\n");
    }
    void m2(){
        m3();
        System.out.println("Printing y from C1 class Defualt decalration for a method \n y= "+ y+"\n");
    }
    private void m3(){
        System.out.println("Printing z from C1 class private declaration for a method  \n z="+z+"\n");
    }
}