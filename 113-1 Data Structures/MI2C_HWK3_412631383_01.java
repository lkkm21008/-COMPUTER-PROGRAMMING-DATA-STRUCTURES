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
public class MI2C_HWK3_412631383_01 {
        public static void main(String[] args) {

        Random r = new Random(111) ; // 111: seed
        int[] a = {18, 29, 33, 47, 58} ;
        System.out.println("a[]="+Arrays.toString(a));
        //2ndMax
        int index=-1;  int max=a[0],min=a[0],secMax=Integer.MIN_VALUE;
        for(int i =0;i<a.length;i++){
         if(a[i]>max){
         max=a[i];
         }
         if(a[i]<min){
             min=a[i];
         }
        }
         for(int i =0;i<a.length;i++){
              if(a[i]<max && a[i]>min){
                     secMax=a[i];
                     index=i;
         }
              }
            System.out.println("2ndMax="+secMax+" Index= "+index);
        // DIY here, rotate right once and print out a[]
        int end=a[a.length-1];
        for(int i =a.length-1;i>0;i--){
          a[i]=a[i-1];
        }
        a[0]=end;
        System.out.println("a[]="+Arrays.toString(a));
        // DIY here, rotate left once and print out a[]
        int start=a[0];        
        for(int i =0;i<a.length-1;i++){
           a[i]=a[i+1];
        }
        a[a.length-1]=start;
        System.out.println("a[]="+Arrays.toString(a));
    }
}
