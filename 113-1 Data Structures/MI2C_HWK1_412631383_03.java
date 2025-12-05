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
public class MI2C_HWK1_412631383_03 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Cumulative online time: ");
        double x=cin.nextDouble();
        System.out.println("freepoint ("+x+") ="+freepoint(x));
    }
    public static double freepoint(double x){
    int points=0;
    if(x>=240){
     if(x<480){
     points=(int)(x/24)*10;
     }
     else if(x<1200){
     points=(int)(x/18)*10;
     }
     else{
     points=(int)(x/12)*10;
     }
    }
    return points;
    }
}
