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
public class MI2C_HWK3_412631383_03 {
     public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {1, 3, 6, 7, 9, 11, 13};

        int diff1 = diff(a, b); 
        int diff2 = diff(b, a);  
   
        System.out.println("diff1 = " + diff1 + ", diff2 = " + diff2);
    }

    public static int diff(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++;
            }
        }

        return count;
    }

 
   
}
