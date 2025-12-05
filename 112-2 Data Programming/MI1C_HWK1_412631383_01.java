/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hwk;
import java.util.*;
import static java.lang.Math.*;
public class MI1C_HWK1_412631383_01 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);  
        double z;
        double x1,x2;
        while(true){
        System.out.print("x,y=");
        double x=cin.nextDouble(), y=cin.nextDouble();
        x1=Math.pow(Math.abs(x-y), 3);
        x2=Math.pow(Math.abs(x+y), 3);
        z=Math.pow((x1+x2),(1/3.0));
       if(x ==0 || y==0){
           System.out.println("bye!");
           break;
       }else{
               System.out.println("z="+z);
       }
        }
                
    }
}
