/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

import java.util.*;
public class MI1C_HWK6_412631383_01 {
    public static void main(String[] args) {
        int x=5,y=9,z=6;
        System.out.println("middle of "+x+","+y+","+z+" is "+middle(x,y,z));     
        x=7;y=10;z=7;
        System.out.println("middle of "+x+","+y+","+z+" is "+middle(x,y,z));   
        
        System.out.println("gcd(98,28)="+gcd(98,28));
        System.out.println("gcd(84,294)="+gcd(84,294));
        
         timeDiff(53029,201817);
    }
 public static int middle(int x,int y,int z){
 if((x>=y && x<=z) || (x<=y && x>=z)){
 return x;
 }else if((y>=x && y<=z) ||(y<=x && y>=z)){
 return y;
 }else{
 return z;
 }
 }
 
 public static int gcd(int x,int y){
 int cf=0;
   for(int i=1;i<x;i++){
   if(x%i==0 && y%i==0){
    cf=i;
   }
   }
 return cf;
 
 }
 
 public static void timeDiff(int x, int y){
  int time1=((x/10000)*3600)+(((x%10000)/100)*60)+(x%100);
  int time2=((y/10000)*3600)+(((y%10000)/100)*60)+(y%100);
int diff=Math.abs(time2-time1);
int hour =diff/3600;
int min=(diff%3600)/60;
int sec=diff%60;
 System.out.printf("diff of %d:%02d:%02d and %d:%02d:%02d is %d%d%d", 
                   x / 10000, (x % 10000) / 100, x % 100,
                   y / 10000, (y % 10000) / 100, y % 100,
                   hour,min,sec);

 }
}
