/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

import java.util.*;
public class MI1C_HWK2_412631383_02 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        System.out.print("x=");
        double x=cin.nextDouble();
        System.out.print("y=");
        int  y =cin.nextInt();
        System.out.println("x\ty\tx^y");
        System.out.println("-------------------");
        for(int i=1;i<=y;i++){
        double z =mypower(x,i);
         System.out.println(x+"\t"+i+"\t"+z);
        }
    }
      public static double mypower(double x ,int y){
   double z = 1;
     for(int i =1;i<=y;i++){
      z*=x;
   }
    return z ;
    }
}
