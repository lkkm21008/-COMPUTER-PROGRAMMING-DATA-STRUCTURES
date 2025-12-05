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
public class MI1C_HWK7_412631383_02 {
    public static void main(String[] args) {
   
        System.out.println("cnk(10, 4)="+cnk(10, 4));
        System.out.println("cnk(20, 12)="+cnk(20, 12));
        System.out.println("cnk(30, 17)="+cnk(30, 17));
    }
     public static int cnk(int n, int k) { //c(30,17)
       //base
       if(k==0) return 1;
       if(k==n) return 1;
       if(k>n)  return 0;
       //induction
       int ans=cnk(n-1,k-1)+cnk(n-1,k);
        return ans;
    }
}
