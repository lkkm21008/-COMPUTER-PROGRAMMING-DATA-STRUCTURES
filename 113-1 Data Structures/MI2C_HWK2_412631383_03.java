/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
public class MI2C_HWK2_412631383_03 {
      public static void main(String[] args) {
         printRightTriangle('=', 5, true); // 用=號畫出高度為5的直角三角形
          System.out.println("------------------------------------------------");
        printRightTriangle('*', 7, false);	// 用*號畫出高度7的空心直角三角形
    }
    public static void printRightTriangle(char symbol, int h, boolean filled) {
       if(filled==true){
       for(int i =0;i<h;i++){
            for(int j=0;j<i;j++){
                System.out.print(symbol);
            }
           System.out.println("");
       }
       }else{
        for(int i =0;i<h;i++){
          for(int j=0;j<=i;j++){
             if(j==0 || j==i || i==h-1){
                 System.out.print(symbol);
             }else{
                 System.out.print(" ");
             }
          }
            System.out.println("");
        }
       }
       
    }
}
