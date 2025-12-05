
package homework;
//將各月份天數，以初始化設值的方式儲存在一整數陣列monthday中，讓使用者輸入一個日期，而後印出該日期是今年的第幾天，考慮閏年。
import java.util.*;
public class MI1C_HWK9_412631383_01 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int[] monthDays={0,31,28,31,30,31,30,31,31,30,31,30,31} ; //[13]
        System.out.print("輸入日期:");
        int y=cin.nextInt(),m=cin.nextInt(),d=cin.nextInt(),mon=0;//201610 25
        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
         monthDays=new int []{0,31,29,31,30,31,30,31,31,30,31,30,31};
        }
        for(int i =0;i<=m;i++){
        mon+=monthDays[i];
        }
        int  da=monthDays[m]-d;
        int days=mon-da;
        System.out.println(y+"/"+m+"/"+d+"是今年第"+days+"天");
    }
}
