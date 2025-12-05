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
public class MI1C_HWK7_412631383_03 {
    public static void main(String[] args) {
     
        for (int i = 1; i <= 20; i++) {
            System.out.println("fib(" + i + ") = " + fib(i));
        }
    }

    public static int fib(int n) {
       
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
    }

