/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;
//使用foreach計算並印出tempt陣列(記錄12月每日溫度)的平均值、最大、最小值。
import java.util.*;
public class MI1C_HWK9_412631383_02 {
    public static void main(String[] args) {
        double [] tempt=new double[31];
         Random r=new Random(111);
        for(int i =0;i<tempt.length;i++){
        tempt[i]=15.0+r.nextDouble()*(28.0-15.0);
        }
       double sum=0,min=tempt[0],max=tempt[1];
        for(double x:tempt){
        sum += x;
        if ( x < min){
            min = x;
        }
         if ( x > max){
            max = x;
        }
        }
           double avg=sum/tempt.length;
            System.out.printf("平均值:%.3f\n",avg);
               System.out.printf("最大值:%.3f\n",max);
              System.out.printf("最小值:%.3f\n",min);
    }
}
