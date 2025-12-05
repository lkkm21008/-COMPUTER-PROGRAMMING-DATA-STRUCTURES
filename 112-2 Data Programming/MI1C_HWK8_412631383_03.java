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
public class MI1C_HWK8_412631383_03 {
    public static void main(String[] args) {
            int n =1080453;
            int digits=noofdigits(n);
            System.out.println("Digits of "+n+" is "+digits);
    }
    public static int noofdigits(int n){
    //basis
    if(n<10){
    return 1;
    }
    return 1+noofdigits(n/10);
    }
}
