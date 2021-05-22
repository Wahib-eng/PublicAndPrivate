package p2;

import com.withWahib.C1;

public class C3 {
    void aMethod(){
        C1 o=new C1();
        o.x=332;
        System.out.println("Printing x From different package class c3  \nx ="+o.x+"\n");//يمكن الوصول الى x
        //لايمكن الوصول الى y and z

    }

}
