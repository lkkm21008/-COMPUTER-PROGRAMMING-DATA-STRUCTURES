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

public class MI2C_HWK7_412631383_02 {
    public static void main(String[] args) {       
        int[] b = {15, 3, 9, 8, 32, 54, 41, 21, 18, 26} ;
        System.out.println("b[]="+Arrays.toString(b));
        mergesort(b) ; 
        System.out.println("MergeSort(b), b[]="+Arrays.toString(b));         
    }

    
    // --------------- Merge Sort --------------- 
    public static void mergesort(int[] a) { // portal funciton
        mergesort(a, 0, a.length-1) ; 
    }
    public static void mergesort(int[] a, int left, int right) {
        // 在a[left]~a[right]範圍內排序
        if (left < right) { // a[]至少有二個元素
            int mid = (left + right) / 2; //切割陣列a
            mergesort(a, left, mid);	  //對a[left]~a[mid]排序
            mergesort(a, mid + 1, right); //對a[mid+1]~a[right]排序
            merge(a, left, mid, right); // 合併二個排序好的串列, a[left~mid], a[mid+1~right]
        }
    }

    public static void merge(int[] a, int left, int mid, int right) {
	// [功能]: 合併二個排序好的串列, a[left~mid], a[mid+1~right]
        //         並將合併結果存回a[left~right]中
        // DIY here, 流程同linearMerge()，但請勿呼叫linerMerge()

    int n1 = mid - left + 1;  
    int n2 = right - mid;     

 
    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++)
        L[i] = a[left + i];
    for (int j = 0; j < n2; j++)
        R[j] = a[mid + 1 + j];

    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            a[k++] = L[i++];
        } else {
            a[k++] = R[j++];
        }
    }

    while (i < n1) {
        a[k++] = L[i++];
    }
    while (j < n2) {
        a[k++] = R[j++];
    }
}
    }    


    
