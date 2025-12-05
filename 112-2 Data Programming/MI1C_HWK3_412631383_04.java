/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

import java.util.*;
public class MI1C_HWK3_412631383_04 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        System.out.println("input w and h:");
        int w =cin.nextInt(); int h=cin.nextInt();
        drawRect(w,h,"*");
    }
    public static void drawRect(int w,int h,String symbol){
    for(int j=1;j<=h;j++){
        for(int i=1;i<=w;i++){
        System.out.print(symbol);
    }
        System.out.println("");
    }
    }
}
