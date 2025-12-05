/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

import java.util.*;
public class MI1C_HWK2_412631383_03 {
    public static void main(String[] args) {
    Scanner cin=new Scanner(System.in);
        System.out.print("x,y:");
        int x=cin.nextInt();int y=cin.nextInt();
        int z =gcd(x,y);
        System.out.println("gcd="+z);
        System.out.print("suit,ponints:");    
        int suit=cin.nextInt();int points=cin.nextInt();
        String cs=suitchar(suit,points);
        System.out.println("card="+cs);
    }
     public static String suitchar(int s ,int p){
    String suit="";
   switch(s){
       case 1 :
           suit="S";
           break;
       case 2:
           suit="H";
           break;
       case 3:
           suit="D";
           break;
       case 4:
           suit="C";
        break;
   }
    String point="";
    if(p ==11){
    point ="J";
    }else if(p ==12){
    point="Q";
    }else if(p==13){
    point="K";
    }else{
    point =String.valueOf(p);
    }
     return suit+"-"+point;
    }
    public static int gcd(int x,int y){
        int a,b,cf=0;
    for(int i =1;i<x;i++){
     if(x%i==0 && y%i==0){
       cf=i;
     } 
    }  
    return cf;
    }
}
