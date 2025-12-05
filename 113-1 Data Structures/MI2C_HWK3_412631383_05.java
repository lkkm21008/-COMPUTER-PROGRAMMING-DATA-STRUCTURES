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
public class MI2C_HWK3_412631383_05 {
     static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {15, 28, 99, 44};

        int[] c = merge(a, b);
        System.out.println("c = a & b = " + Arrays.toString(c)); 
    }

    public static int[] merge(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;
        int lenC = lenA + lenB;
        int[] c = new int[lenC]; 

        int i = 0, j = 0, k = 0; 

        while (i < lenA && j < lenB) {
            c[k++] = a[i++];
            c[k++] = b[j++]; 
        }

        while (i < lenA) {
            c[k++] = a[i++];
        }

        while (j < lenB) {
            c[k++] = b[j++];
        }
        return c; 
    }
}

