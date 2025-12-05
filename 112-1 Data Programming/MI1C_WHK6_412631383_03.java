//輸入出生年分(西元紀年)，並判斷是否為閏年。
//(a)若輸入的西元紀年小於1900，則持續要求使用者需輸入正確年份為止。
//(b)承(a)，若使用者連續輸入錯誤三次，則結束程式執行(但只要輸入一次對了，就可打消之前記錄)。
package homework;

import java.util.*;
public class MI1C_WHK6_412631383_03 {
 public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int myear , errcnt = 0 ;
        do{
            System.out.println("year=");
            myear = cin.nextInt();
            if(myear<1900){                
                errcnt++ ;
                System.out.println("Try again(>=1900)");
                }else{
                errcnt = 0 ;
                 if (myear % 4 == 0 && myear % 100 != 0) {
                    System.out.println(myear + " is a leap year");
                } else {
                    System.out.println(myear + " not a leap year");
                }
                }
                if(errcnt>=3){
                    System.out.println("連續錯誤三次,程序結束");
                    break ;
                }
            
        } while(errcnt<3) ;
    }
}