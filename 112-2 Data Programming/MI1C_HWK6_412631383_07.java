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
public class MI1C_HWK6_412631383_07 {
    public static void main(String[] args) {
        int[][] data= {{30, 60, 70, 60, 80, 90},
            {23, 36, 47, 36, 98, 29},
            {77, 23, 74, 32, 90, 20}};
        double avg=avg(data);
        System.out.printf("avg=%.2f",avg);
        System.out.println("");
        double rowavg[]=rowavg(data);
        System.out.print("rowavg[] = ");
        for (double row : rowavg) {
            System.out.printf("%.2f ", row);
        }
        System.out.println("");
         double colavg[]=colavg(data);
         System.out.print("colavg[] = ");
        for (double col : colavg) {
            System.out.printf("%.2f ", col);
        }
    }
  public static double avg(int [][]data){
      int sum=0,cnt=0;
  for(int i =0;i<data.length;i++){
  for(int j=0;j<data[i].length;j++){
  sum+=data[i][j];
  cnt++;
  }
  }
  double avg =(double)sum/cnt;
  return avg;
  }
  
  public static double[] rowavg(int [][]data){
   double []rowavg=new double [data.length];
   
   for(int i =0;i<data.length;i++){
       int sum =0;
   for(int j=0;j<data[i].length;j++){
    sum +=data[i][j];
   }
   rowavg[i]=(double)sum/data[i].length;
   }
  return rowavg;
  }
  public static double[] colavg(int [][]data){
  double []colavg=new double [data[0].length];
  
  for(int j=0;j<data[0].length;j++){
      int sum=0;
  for(int i =0;i<data.length;i++){
  sum +=data[i][j];
  }
  colavg[j]=(double) sum/data.length;
  }
  
  return colavg;
  }
}
