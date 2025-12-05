/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

/**
 *
 * @author admin
 */
class Time{int h,m,s;}
public class MI1C_HWK9_412631383_03 {
    public static void main(String[] args) {
         Time t1 = new Time(); 
     Time t2 = new Time();
     t1.h = 17; t1.m = 30; t1.s = 30;
    t2.h = 5; t2.m = 45; t2.s = 55;
    int sec1 = (t1.h * 3600) + (t1.m * 60) + t1.s;
    int sec2 = (t2.h * 3600) + (t2.m * 60) + t2.s;
    Time t3 = new Time();
    int diff = sec1 - sec2;
    t3.h = diff / 3600;
    t3.m = (diff % 3600) / 60;
    t3.s = diff % 60;
     System.out.println("difference of time1 and time2 is " + t3.h + ":" + t3.m + ":" + t3.s);  
    }
}
