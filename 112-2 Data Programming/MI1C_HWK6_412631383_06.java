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
public class MI1C_HWK6_412631383_06 {
      public static void main(String[] args) {
        int [][]pic=new int[6][6];
        Random r=new Random();
        for(int i =0;i<pic.length;i++){
        for(int j=0;j<pic[i].length;j++){
            if(i==0 || i==pic.length-1 || j==0 || j==pic[i].length-1){
            pic [i][j]=255;
            }else{
            pic[i][j]=r.nextInt(256);
            }
        }
     }       
     for(int i =0;i<pic.length;i++){
         System.out.println(Arrays.toString(pic[i]));
     }
    }
}
