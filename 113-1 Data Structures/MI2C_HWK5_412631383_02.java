/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
class Time { // 24小時進制的時間
    int h, m, s ; // h: 0~23: m, s: 0~59
    // DIY here, set(), print(), inc(), diff()
    public void set(int a, int b, int c) {
        if (a<0 || a>23 || b<0 || b>59 || c<0 ||c>59) {
            h=m=s=0 ;
        }else {
            h = a;
            m = b;
            s = c;
        }
    }
    public void inc(int sec){
        s += sec;
        m += s / 60;
        s = s % 60;
        h += m / 60;
        m = m % 60;
        h = h % 24;
    }
    public int diffsec(Time other) {
        int thisInSec = this.h * 3600 + this.m * 60 + this.s;
        int otherInSec = other.h * 3600 + other.m * 60 + other.s;
        int diff = otherInSec - thisInSec;
        if (diff < 0) {
            diff += 24 * 3600;
        }
        return diff;
    }
    public Time diff(Time other) {
        int diffInSec = this.diffsec(other);
        Time diffTime = new Time();
        diffTime.h = diffInSec / 3600;
        diffInSec %= 3600;
        diffTime.m = diffInSec / 60;
        diffTime.s = diffInSec % 60;
        return diffTime;
    }
    public String toString(){
     //return this.h+":"+this.m+":"+this.s;
    return String.format("%02d:%02d:%02d", this.h, this.m, this.s);
    }
     public static void print(int diffInSec, String message) {
        System.out.println(message + diffInSec + " seconds");
    }
}
public class MI2C_HWK5_412631383_02{
    public static void main(String[] args) {
        Time t1 = new Time(), t2 = new Time() ; 
        t1.set(17, 20, 30) ;	t2.set(6, 35, 45) ;
        System.out.println("t1="+t1); // t1=17:20:30
        System.out.println("t2="+t2); // t2=06:35:45

         t2.inc(5000) ; //將t2的時間向前撥5000秒
        System.out.println("after inc t2 by 5000 secs, t2="+t2);

        int diffInSec = t1.diffsec(t2) ; 
        Time.print(diffInSec, "diff of t1 and t2=") ; 

        Time diffInTime = t1.diff(t2) ; 
        System.out.println("diff of t1 and t2="+diffInTime) ; 
    }
}
/*
[程式輸出] : t1.diff(t2): 若t1<t2，則計算t2-t1秒差，若t1>t2, 表示t2是明天的時間
t1=17:20:30
t2=06:35:45
after inc t2 by 5000 secs, t2 = 07:59:05
diff of t1 and t2=7152
diff of t1 and t2=14:38:35
*/
