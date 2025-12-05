/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */import java.util.*;
class Time{
   int h;
   int m;
   int s;

}
public class MI2C_HWK4_412631383_01 {
     public static void main(String[] args) {
        Time t1=new Time();
        Time t2=new Time();
       Scanner cin=new Scanner(System.in);
       System.out.print("t1=");
       String s1=cin.next();
       String[] ss1=s1.split(":");
          t1.h=Integer.parseInt(ss1[0]);
       t1.m=Integer.parseInt(ss1[1]);
       t1.s=Integer.parseInt(ss1[2]);
        System.out.print("t2=");
      String s2=cin.next();
       String[] ss2=s2.split(":");
       t2.h=Integer.parseInt(ss2[0]);
       t2.m=Integer.parseInt(ss2[1]);
       t2.s=Integer.parseInt(ss2[2]);
       Timex(t1,t2);
     }
   public static void Timex(Time t1,Time t2){
     int time1=sec(t1);
     int time2=sec(t2);
     if (time2 < time1) {
            time2 += 24 * 3600;  
        }
     int diff=time2-time1;
   
     int hour=diff/3600;
     int min=(diff%3600)/60;
     int sec=diff%60;
     System.out.printf("時間差異是: %02d:%02d:%02d%n", hour, min, sec);
   }
  public static int sec(Time t){
    int sec=(t.h*3600)+(t.m*60)+t.s;
    return sec;
  }
}
