/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

import java.util.*;
public class MI1C_HWK2_412631383_01 {
    public static void main(String[] args) {
         Random r=new Random(222);
         int[] a=new int [10]; int []b=new int [10]; int[]c=new int[10];
        
         System.out.println("a\tb\tc\tarea");
         System.out.println("----------------------------------------------");
         for(int i =0;i<10;i++){
          a[i] =r.nextInt(15-5+1)+5;
          b[i] = r.nextInt(15-5+1)+5;
          c[i] = r.nextInt(15-5+1)+5;
          double area;
          if(istriangle(a[i],b[i],c[i])==true){
           area =trianglearea(a[i],b[i],c[i]);
            System.out.printf("%d\t%d\t%d\t%.2f\n",a[i],b[i],c[i],area);
          }else{
              System.out.printf("%d\t%d\t%d\tillegal\n",a[i],b[i],c[i]);
          }
         }

    }
     public static double trianglearea(int a,int b,int c){ // R X R X R -> R
     double s=(a+b+c)/2;
     double area =Math.sqrt(s*(s-a)*(s-b)*(s-c)); //海龍公式計算三角形面積
     return area;
    }
     public static boolean istriangle(int a,int b,int c){
      return (a + b > c) && (a + c > b) && (b + c > a);
     }
}
