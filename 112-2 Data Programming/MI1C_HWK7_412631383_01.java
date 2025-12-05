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
public class MI1C_HWK7_412631383_01 {
    public static void main(String[] args) {
          int[][] data ={{80,77,66,53,44,90,0},
                    {97,34,50,88,92,10,0},
                    {70,80,72,40,77,60,0},
                    {0, 0, 0, 0, 0, 0, 0}} ;
          for (int j = 0; j < data[0].length; j++) {
             int max = data[0][j]; 
          for (int i = 1; i < data.length - 1; i++) { 
              if (data[i][j] > max) {
                 max = data[i][j];
                }
    }
                data[data.length - 1][j] = max; 
}
         for (int i = 0; i < data.length; i++) {
              System.out.print("[");
         for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j]);
              if (j < data[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
