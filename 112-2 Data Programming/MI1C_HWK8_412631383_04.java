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
public class MI1C_HWK8_412631383_04 {
   public static void main(String[] args) {
	   int[] a = {18, 77, 23, 55, 7, 93, 11, 44} ;
        Arrays.sort(a) ; // 由小到大排序
        // int[] a = {7, 11, 18, 23, 44, 55, 77, 93} ;
        int[] key = {77, 11, 15} ;
        for (int i = 0;  i<key.length; i++) {
            int index = binarySearch(a,key[i]);
            if (index == -1) 
		System.out.println(key[i]+" not found!") ;
            else 
		System.out.println(key[i]+" is in index: "+index) ;
        }
    }
    public static int binarySearch(int[] a, int key) { // portal function
        return binSearch(a, 0, a.length-1, key) ;
    }
    public static int binSearch(int[] a, int low, int high, int key) { // recursive function
	   // -- (1) base case ---
        if (low > high) return -1 ;
	   // --- (2) induction ---
        int index=-1, mid = (low+high)/2 ;
        
        if (key == a[mid]) 
            index =   mid   ;
        else if (key < a[mid])
            index =   binSearch(a,low,mid-1,key)                    ;
        else  // key>a[mid]
            index =    binSearch(a,mid+1,high,key)                   ;
        
        return index ;
   }   
}
