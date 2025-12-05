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
public class MI1C_HWK8_412631383_01 {
    public static void main(String[] args) {
         int[] a = {1, 3, 5, 7, 9, 11};
//          for(int i =0;i<a.length;i++){
//              System.out.print(a[i]+" ");
//          }
//         System.out.println("");
        printArray(a, 0); // 由a[0]開始印起
        //11 9 7 5 3 1
        reversePrint(a,0,a.length-1); // 將a[]的內容反序印出
//        for(int i=a.length-1;i>=0;i--){
//            System.out.print(a[i]+" ");
//        }
//          System.out.println("");
    }
      public static void printArray(int[] a, int start) {
        // ===  base case 
        if (start == a.length) { // 已到陣列末尾
            System.out.println(); //印出換行
            return; //!!!
        }
        // === induction 
        System.out.print(a[start]+" "); //1 ->
        printArray(a, start + 1);
    }
    private static void reversePrint(int[] a, int start, int end){
        // base case 
        if (end<0) {
            System.out.println();
            return ;
        }
        // induction: DIY here 
        System.out.print(a[end]+" ");
        reversePrint(a,start,end-1);
    }
}
