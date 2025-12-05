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
public class MI1C_HWK6_412631383_05 {
    public static void main(String[] args) {
         int[] rowLen = {3, 5, 0, 4};
        int[] num = {11, 12, 13, 21, 22, 23, 24, 25, 41, 42, 43, 44};
        int[][] ms = new int[rowLen.length][]; 
        System.out.println(rowLen.length);
      
        for (int i = 0, index = 0; i < rowLen.length; i++) {
            ms[i] = new int[rowLen[i]];
            for (int j = 0; j < rowLen[i]; j++) {
                ms[i][j] = num[index++];
            }
        }
        
         for (int[] row : ms) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
