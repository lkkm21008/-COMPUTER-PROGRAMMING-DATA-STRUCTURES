/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;
import java.util.*;
public class MI1C_HWK3_412631383_01 {
    public static void main(String[] args) {
        double ans;
        for(double i=-5;i<=5;i+=0.5){
        ans=fx(i);
            System.out.printf("f(%.1f)=%.1f",i,ans);
            System.out.println("");
        }
    }
    public static double fx(double x){
        double ans;
    if(x>3){
    ans=Math.pow(x,2);
    }else if(x>=-3 && x<=3){
    ans=Math.sqrt(Math.abs(x));
    }else{
    ans=Math.pow(x,5)+(2*Math.pow(x,4));
    }
    return ans;
    }
}
