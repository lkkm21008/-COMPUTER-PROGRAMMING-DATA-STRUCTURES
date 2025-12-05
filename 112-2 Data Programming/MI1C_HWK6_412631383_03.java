/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

/**
 *
 * @author admin
 */
import java.util.*;
public class MI1C_HWK6_412631383_03 {
    public static void main(String[] args) {
         int []x1={0,3,3}; int []y1={0,0,4};
         double area=area(x1,y1);
         System.out.println("area="+area);
    }
  public static double area(int []x1,int []y1){
   double d1=Math.sqrt(Math.pow(x1[1]-x1[0], 2)+Math.pow(y1[1]-y1[0], 2));
   double d2=Math.sqrt(Math.pow(x1[2]-x1[1],2)+Math.pow(y1[2]-y1[1], 2));
   double d3=Math.sqrt(Math.pow(x1[0]-x1[2],2)+Math.pow(y1[0]-y1[2],2));
  
   double s=(d1+d2+d3)/2;
   
   double area=Math.sqrt(s*(s-d1)*(s-d2)*(s-d3));
  
   return area;
  }
}
