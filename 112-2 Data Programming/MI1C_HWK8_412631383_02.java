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
public class MI1C_HWK8_412631383_02 {
    public static void main(String[] args) {
    int []a={5,9,4,1,7,2,11,3};
    int min=findMin(a,0,a.length-1);    
     System.out.println("min="+min);
    }
    public static int findMin(int[] a, int start, int end) {
        // (1) basis: 只有一個元素, 則該元素就是最小值
        if(start>end) return Integer.MAX_VALUE;
        if(start==end) return a[start];
        // (2) induction: 
        //  (a)作法一: 找出陣列左半部、右半部之最小值，傳回其中較小者
//         Arrays.sort(a);
//         int mid=start+(end-start)/2;
//         int left=findMin(a,start,mid);
//         int right=findMin(a,mid+1,end);
//         if(left<right){
//         return left;
//         }else{
//         return right;
//         }
        //  (b)作法二: 找出a[start+1]~a[end]的最小值，再與a[start]比較，傳回其中較小者
        int min=findMin(a,start+1,end);
        if(a[start]<min){
        return a[start];
        }else{
        return min;
        }
    }
    
}
