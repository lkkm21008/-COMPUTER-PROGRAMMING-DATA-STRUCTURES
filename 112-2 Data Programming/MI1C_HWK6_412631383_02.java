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
public class MI1C_HWK6_412631383_02 {
    public static void main(String[] args) {
             int []a={15,18,-1,35,-2,48,32,15,-9,56,-21,27,42,56};
             System.out.println("a[]="+Arrays.toString(a));
             int max=max(a);
             System.out.println("max="+max);
             
             int second=second(a);
             System.out.println("second="+second);
    }
    public static int max(int []a){
    int max=0;
    for(int i =0;i<a.length;i++){
    if(a[i]>0){
    max=a[i];
    }
    }
    return max;
    }
    
    public static int second(int []a){
    int max=max(a);
    int second=0;
    for(int num:a){
    if(num>max){
      second=max;
      max=num;
    }else if(num>second && num!=max){
    second=num;
    }
    }
    return second;
   
    }
}
