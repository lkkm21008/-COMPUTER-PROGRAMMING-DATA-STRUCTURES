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
public class MI1C_HWK5_412631383_03 {
    public static void main(String[] args) {
        int[] a=new int[10], b=new int[10], c=new int[10] ;
          Random r =new Random(111);
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(101);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = r.nextInt(101);
        }
        System.out.println("a[i]="+Arrays.toString(a));
        System.out.println("b[i]="+Arrays.toString(b));
        sumarray(a, b, c);
        System.out.println("c[i]=" + Arrays.toString(c));
        
    }
    
    public static void sumarray(int []a,int []b,int []c){   
       for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
       
    }
}
