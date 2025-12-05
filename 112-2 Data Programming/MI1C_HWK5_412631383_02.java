/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;

/**
 *
 * @author admin
 */
public class MI1C_HWK5_412631383_02 {
    public static void main(String[] args) {
        int[] a={8, 7, 15, 6, 4, 28, 9} ;
        int[] b= {-3, 12, -8, 3} ;
        double avg2= avg2(a, b) ;
        System.out.println("avg of  a[], b[]="+avg2) ;
      }
 // DIY here}
    public static double avg2(int []a,int []b){
        double suma=0; double sumb=0;double sum=0;
        for(int i =0;i<a.length;i++){
        suma+=a[i];
        }
         for(int i =0;i<b.length;i++){
        sumb+=b[i];
        }
        sum=suma+sumb;
       double avg =sum/(a.length+b.length);
       return avg;
    }
    }
        

