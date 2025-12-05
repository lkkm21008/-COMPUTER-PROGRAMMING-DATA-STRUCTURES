/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;
import java.util.*;
public class MI1C_HWK5_412631383_01 {
    public static void main(String[] args) {
    int []a=new int[50];
    Random r =new Random(111);
    int sum=0;
    for(int i =0;i<a.length;i++){
    a[i]=+r.nextInt(101);
    sum+=a[i];
    }
   System.out.println("avg=" + average(a));
        System.out.println("std=" + std(a, sum));
    }
    
  public static double average(int[] a) {
 int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return (double) sum / a.length;
}
    // ((sum(xi-avg)^2/n)^1/2 <-std
   public  static double std(int []a ,int sum){
        double avg = average(a);
        double sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            sum2 += Math.pow((a[i] - avg), 2);
        }
        double std = sum2 / (a.length - 1);
        return Math.sqrt(std);
   }
}
