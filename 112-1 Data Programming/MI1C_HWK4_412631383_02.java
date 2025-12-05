
package homework;
import java.util.*;
public class MI1C_HWK4_412631383_02 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.print("Input score:");
           int test1,test2,test3;
           int cnt=0;
           test1=cin.nextInt();
           test2=cin.nextInt();
           test3=cin.nextInt();
          if(test1>=60){
          cnt=cnt+1;
          if(test2>=60){
          cnt=cnt+1;
          }
          if(test3>=60){
          cnt=cnt+1;
          }
          }
           System.out.println("cnt="+cnt);
           if(cnt>=2){
               System.out.println("Pass");
           }else{
               System.out.println("Try again");
           }
    }
}
