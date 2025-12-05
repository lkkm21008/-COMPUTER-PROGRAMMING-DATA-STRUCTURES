/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
public class MI2C_HWK3_412631383_02 {
  public static void main(String[] args) {
        int[] a = {28, 37, 52, 49, 77, 80, 30, 52, 90, 28, 11, 20};
        int dno = dup_no(a);
        System.out.println(dno); 
    }

    public static int dup_no(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    return a[i]; 
                }
            }
        }
        return -1; 
    }
}
