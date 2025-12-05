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
public class MI2C_HWK2_412631383_05 {
    public static void main(String[] args) {
             Scanner cin=new Scanner(System.in);
             int[] a = {1, 3, 5, 7, 9};
             System.out.print("length of b[]:");
             int blength=cin.nextInt();
             int[]b=new int[blength];
             for(int i =0;i<b.length;i++){
             System.arraycopy(a, i%a.length, b, i, 1);
             }
           System.out.println("a[] = " + Arrays.toString(a));
        System.out.println("b[] = " + Arrays.toString(b));
    }
}
/* 
5. System.arraycopy()之運用, 先產生一個陣列a[] = {1,3,5,7,9}; 再產生一個陣列b[]，b[]的長度讓使用者輸入，之後讓將a[]的內容複製到b[](循環填滿複製)。

length of b[] = ? 33 

a[]=[1, 3, 5, 7, 9]

b[]=[1, 3, 5, 7, 9,  1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1, 3, 5]
*/   
        