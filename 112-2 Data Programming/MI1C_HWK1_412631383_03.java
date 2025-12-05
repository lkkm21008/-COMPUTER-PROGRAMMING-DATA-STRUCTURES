/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

import static java.lang.Math.*;
import java.util.*;
public class MI1C_HWK1_412631383_03 {
     static Scanner cin = new Scanner(System.in) ;
    static Random r = new Random(333) ;
    public static void main(String[] args) {
     // System.out.print("n=");
     //   int n = cin.nextInt() ; 
     int n =10;
     int[] x = new int[n], y=new int[n] ;//x[0],y[0])(x[1],y[1])...
      for(int i =0;i<n;i++){
       x[i]=r.nextInt(51); y[i]=r.nextInt(51);
     }
     for(int i =0;i<n;i++){
         System.out.printf("(%d,%d)",x[i],y[i]);
         System.out.println("");
     }
        System.out.println("--------------------------");
   double mindis = Double.MAX_VALUE;
        int minIndex1 = 0, minIndex2 = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double distance = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                if (distance < mindis) {
                    mindis = distance;
                    minIndex1 = i;
                    minIndex2 = j;
                }
            }
        }
        System.out.printf("min distance=%.1f%n", mindis);
        System.out.printf("From (%d,%d) to (%d,%d)%n", x[minIndex1], y[minIndex1], x[minIndex2], y[minIndex2]);
    }   
    }