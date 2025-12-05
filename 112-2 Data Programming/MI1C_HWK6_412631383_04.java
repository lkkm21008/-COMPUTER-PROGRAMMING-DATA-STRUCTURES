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
public class MI1C_HWK6_412631383_04 {
    public static void main(String[] args) {
        int []x={5,7,9,2}; int []y={12,7,4,3,23,11};
    int []z=concat(x,y);   
        System.out.println("z[]=x[]+y[]="+Arrays.toString(z));    
        int []a={15,18,-1,35,-2,48,32,15,-9,56,-21,27,42,56};    
    int[] evens=evennum(a);
        System.out.println("evenNum of a[]="+Arrays.toString(evens));
    }
  public static int[] concat(int []x,int []y){
   int []z=new int[x.length+y.length]; 
   for(int i =0;i<x.length;i++){
   z[i]=x[i];
   }
   for(int i =0;i<y.length;i++){
   z[i+x.length]=y[i];
   }
   return z;
  }
  public static int[] evennum(int []a){
int cnt = 0;
    for (int i = 0; i < a.length; i++) {
        if (i % 2 != 0) { 
            cnt++;
        }
    }
  
    int[] num = new int[cnt];
    int index = 0;
  
    for (int i = 0; i < a.length; i++) { 
        if (i % 2 != 0) { 
            num[index++] = a[i];
        }
    }
    return num;
  }
}
