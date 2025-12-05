/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
public class MI2C_HWK2_412631383_01 {
      // public static int[] monthDays={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
    public static int[] accMonthDays = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    public static void main(String[] args) {
        int deposit = 128_0000; // 存款128萬，時間[date1, date2]
        int date1 = 20210710, date2 = 20240715;   // case 1
        // int date1 = 20210707, date2 = 20250930 ; // case 2
        double iRate = 0.03; // 年利率3% 
        double interest = cal_interest(deposit, iRate, date1, date2);
        System.out.printf("Total Interest=NT$%.3f\n", interest);
    }

    public static double cal_interest(int amount, double iRate, int startDate, int endDate) {
        // DIY here, 
        int y1=startDate/10000;
        int m1=(startDate%10000)/100;
        int d1=startDate%100;
        
        int y2=endDate/10000;
        int m2=(endDate%10000)/100;
        int d2=endDate%100;
        
        int diff=0;
        
        if(y1==y2){
         diff=iThDaysOfYear(y2,m2,d2)-iThDaysOfYear(y1,m1,m2);
        }else{
         diff=(isLeapYear(y1) ? 366:365)-iThDaysOfYear(y1,m1,d1);
        }
          for (int i = y1 + 1; i < y2; i++) {
              diff+= isLeapYear(i) ? 366 : 365;
            }
        return amount*iRate*diff/(isLeapYear(y2) ? 366 : 365);// 自行修改本行
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int iThDaysOfYear(int y, int m, int d) { //此日期是當年的第幾日(由1/1算起)
        int days = ((m >= 2 && m <= 12) ? accMonthDays[m - 1] : 0) + d;
        if (isLeapYear(y) && m > 2) {
            days++;
        }
        return days;
    }
}
