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
public class MI1C_HWK9_412631383_01 {
       public static void main(String[] args) { 
        hanoi(3) ;  
    } // hanoi tower: 有3個盤子
    public static void hanoi(int n) {  //遞迴的入口函數(portal function)
        //為柱子命名 from:A, temp:B, to:C
        hanoi(n, 'A', 'B', 'C') ; 
    }
    public static void hanoi(int n, char from , char temp, char to) {
        // -- (1) base cases ---
        if (n <= 0) return ;
        if (n == 1) { System.out.println(from+"->"+to);  return ;}
        // -- (2) induction cases --
        hanoi(n-1,from,to,temp);                       ; //(a)
        hanoi(1,from,temp,to); //(b)
        hanoi(n-1,temp,from,to)                      ;		//(c)                      
    }
}
// a-c a-b c-b a-c b-a b-c a-c