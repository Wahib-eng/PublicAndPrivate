package com.withWahib;

public class C2 {
    void aMethod(){
        C1 o=new C1();
        o.x=5;// ممكن الوصول الى اكس الموجودة في الكلاس رقم 1 لانها معرفة كعام
        System.out.println("Printing x from C2 class  declaration from C1 in C2,  \n x= "+o.x+"\n");
        o.y=5;// ممكن الوصول الى واي في الكلاس رقم 1 لانها default
        System.out.println("Printing y from C2 class  declaration from C1 in C2,  \n y= "+o.y+"\n");
        // لايمكن الوصول الى z في كلاس 1 لانها معرفة كخاص
        System.out.println("Calling C1 methods from C2 \n ");
        o.m1();//يمكن استدعائها من كلاس 1 لانها معرفة كعام
        o.m2();//يمكن استدعائها من كلاس 1 لانها معرفة default
    }
}