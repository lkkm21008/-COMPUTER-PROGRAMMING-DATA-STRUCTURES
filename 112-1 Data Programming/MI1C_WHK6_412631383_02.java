
package homework;
//讓使用者輸入一正整數，並判別其是否為質數。
import java.util.*;
public class MI1C_WHK6_412631383_02 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.print("請輸入一正整數:");
        int n =cin.nextInt();
        int cnt=0;
        for(int i =1;i<=n;i++){
        if(n%i==0){
        cnt++;
        }
        }
          if(cnt==2){
            System.out.println(n+" is prime.");
        }else{
            System.out.println(n+" isn't prime.");
        }
  
    }
}
