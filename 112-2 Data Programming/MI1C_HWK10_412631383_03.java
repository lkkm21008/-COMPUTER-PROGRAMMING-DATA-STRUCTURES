/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

/**
 *147 ex2
 * @author admin
 */
class Time {
    int h, m, s;

    static void set(Time t, int h, int m, int s) {
        t.h = h;
        t.m = m;
        t.s = s;
    }

   
    static void print(Time t, String header) {
        System.out.printf(header + "%02d:%02d:%02d\n", t.h, t.m, t.s); 
    }

   
    static void inc(Time t, int s) {
        int totals = t.h * 3600 + t.m * 60 + t.s + s;
        totals = (totals % 86400 + 86400) % 86400; 
        t.h = totals / 3600;
        t.m = (totals % 3600) / 60;
        t.s = totals % 60;
    }

    
    static int diff(Time t1, Time t2) {
        int time1 = t1.h * 3600 + t1.m * 60 + t1.s;
        int time2 = t2.h * 3600 + t2.m * 60 + t2.s;
        return Math.abs(time1 - time2);
    }
}

public class MI1C_HWK10_412631383_03 {
    public static void main(String[] args) {
        Time t1 = new Time(), t2 = new Time();
        Time.set(t1, 17, 20, 30);
        Time.set(t2, 6, 35, 45);
        Time.print(t1, "t1=");
        Time.print(t2, "t2=");
        Time.inc(t2, 5000); 
        Time.print(t2, "t2=");
        int diff = Time.diff(t1, t2);
        System.out.println("diff of t1 and t2=" + diff);
    }
}


