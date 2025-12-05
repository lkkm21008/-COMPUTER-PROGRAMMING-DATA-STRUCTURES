/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

/**
 *
 * @author admin
 */
class Time { // 24小時進制的時間
    int h, m, s;
void set(int h,int m ,int s){
this.h=h; this.m=m;this.s=s;
}
void print(String header){
  System.out.printf(header + "%02d:%02d:%02d\n", this.h, this.m, this.s); 
}
void inc(int s){
    int totals = this.h * 3600 + this.m * 60 + this.s + s;
        totals = totals % 86400; // 确保时间在24小时内
        this.h = totals / 3600;
        this.m = (totals % 3600) / 60;
        this.s = totals % 60;
}
int toSec(){
 return this.h*3600+this.m*60+this.s;
}
int diff( Time t2){
    //
  int diff = Math.abs(this.toSec() - t2.toSec());
        return diff;
}
}

public class MI1C_HWK11_412631383_02 {
     public static void main(String[] args) {
        Time t1 = new Time(), t2 = new Time();
     
        t1.set(17, 20, 30);
        t2.set(6, 35, 45);
        t1.print("t1=");
        t2.print("t2=");

        t2.inc(5000); 
        t2.print("t2=");
        int diff = t1.diff(t2);
        System.out.println("diff of t1 and t2 = " + diff);
     
    }
}
