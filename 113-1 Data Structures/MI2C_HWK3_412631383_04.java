/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
import java.util.*;
public class MI2C_HWK3_412631383_04 {
        public static void main(String[] args) {
        double[] a = {28, 37, 52,49, 77, 80, 30, 52, 90, 38, 77, 80}; // -14: 0, 33:1
         normalize(a) ; 
       System.out.println("after normalization, a[]="+Arrays.toString(a)) ; 
    }
    // DIY here, 先找出a[]之最小值和最大值
public static void normalize(double []a){ //線性正規化
        double min=min(a) ,max=max(a);
      System.out.println("min="+min+" max="+max);
      for(int i=0;i<a.length;i++){
       a[i]=(a[i]-min)/(max-min);
      }
}
public static double max(double []a){
        double  max=a[0];
        for(double i:a){
        if(i>max){
         max=i;
        }
        } 
    return max;
}
public static double min(double a[]){
      double min=a[0];    
    for(double i:a){
         if(i<min){
         min=i;
         }
        }
    return min;
 }
}
