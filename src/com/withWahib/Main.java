package com.withWahib;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        C1 h=new C1();
        h.m2();
        C2 k=new C2();
        k.aMethod();
        C1[] array=new C1[5];
        for(int i=0 ; i< array.length;i++){
            array[i]=new C1();
        }


        for(int i=0 ; i< array.length;i++){
            array[i].m2();
        }


    }
}
