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
	int h, m, s ; 
	// DIY here, set(), print(), inc(), diff(), void print(int sec, String msg)
static void set(Time t,int h,int m,int s){
  t.h=h; t.m=m; t.s=s;
}
static void set(Time t,String time){
 String[] ss=time.split(":");
 t.h=Integer.parseInt(ss[0]);
 t.m=Integer.parseInt(ss[1]);
 t.s=Integer.parseInt(ss[2]);
}
static void print(Time t,String header){
    System.out.println(header+t.h+":"+t.m+":"+t.s);
}
static void inc(Time t,int inc){
  int time = sec(t) + inc;   
        t.h = (time / 3600) % 24; 
        t.m = (time % 3600) / 60; 
        t.s = time % 60; 
}
static int sec(Time t){
    int sec=(t.h*3600)+(t.m*60)+t.s;
    return sec;
  }
 static int diff(Time t1,Time t2){
     int time1=sec(t1);
     int time2=sec(t2);
     if (time2 < time1) {
            time2 += 24 * 3600;  
        }
   
     return time2-time1;
   }
static void print(int sec, String msg) {
        int hour = sec / 3600;
        int min = (sec % 3600) / 60;
        int second = sec % 60;
        System.out.printf("%s%02d:%02d:%02d%n", msg, hour, min, second);
    }
  // Time.diff(t1,t2):若t1<t2，則計算t2-t1秒差，若t1>t2, 表示t2為隔天時間
}
public class MI2C_HWK4_412631383_03{
	public static void main(String[] args) {
            Time t1 = new Time(), t2 = new Time() ; 
            Time.set(t1,20, 20, 25) ;	
            Time.set(t2, "9:30:45") ; // case 1
            Time.print(t1, "t1="); 	Time.print(t2, "t2=") ;
            Time.inc(t2, 3750) ; //將t2的時間向前撥3750秒, 1h 2m 30s
            Time.print(t2, "inc(t2, 3720), t2=") ; 
            int diff = Time.diff(t1, t2) ; 
            Time.print(diff, "diff of t1 and t2=") ; 
	}
}
/* 
<case 1>
t1=9:30:45 
t2=20:20:25
inc(t2,3720), t2=21:22:55
diff between t1 and t2 = 11:13:10
<case 2>
t1=20:20:25 
t2=9:30:45
inc(t2,3720), t2=10:33:15
diff of t1 and t2 = 14:12:50 (相差14小時12分50秒)
*/