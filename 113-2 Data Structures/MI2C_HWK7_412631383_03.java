/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
import java.util.Arrays;

public class MI2C_HWK7_412631383_03 {
    public static void main(String[] args) {
        int[] d1 = new int[]{18, 23, 44, 59} ;
        int[] d2 = new int[]{35, 55, 65} ;
        int[] d3 = linearMerge(d1, d2) ;
        System.out.println("d3=merge(d1,d2)="+Arrays.toString(d3));
        
        d3 = linearMerge(d2, d1) ;
        System.out.println("d3=merge(d1,d2)="+Arrays.toString(d3));        
    }
    
    // ----- linearMerge(a, b) ----
    public static int[] linearMerge(int[] a, int[] b) {
      
    int[] c = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length) {
        if (a[i] <= b[j]) {
            c[k++] = a[i++];
        } else {
            c[k++] = b[j++];
        }
    }

    while (i < a.length) {
        c[k++] = a[i++];
    }

    while (j < b.length) {
        c[k++] = b[j++];
    }

    return c;
}
    }    

