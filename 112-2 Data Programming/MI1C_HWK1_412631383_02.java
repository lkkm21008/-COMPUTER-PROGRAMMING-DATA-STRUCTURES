/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;
import static java.lang.Math.*;
public class MI1C_HWK1_412631383_02 {
    public static void main(String[] args) {
        double x=1,y=2,r=8.5;
        double[] a= new double[360], b = new double[360] ;
        for(int deg=0;deg<360;deg++){
        double rad=Math.toRadians(deg);
        a[deg]=x+r*Math.cos(rad);
        b[deg]=y+r*Math.sin(rad);
        }
        for(int i =0;i<360;i+=15){
            System.out.printf("%d:(%.2f,%.2f)\n",i,a[i],b[i]);
        }
    }
}
