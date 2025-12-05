//使用雙層迴圈繪製以下指定圖形
package homework;

import java.util.*;
public class MI1C_WHK6_412631383_04 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("input r,c:");
        int r=cin.nextInt(); int c=cin.nextInt();
       for(int j=1;j<=r;j++){
       for(int i =c;i>=1;i--){
            System.out.print(i);
               
        }
           System.out.println("");
       }
    }
}
 