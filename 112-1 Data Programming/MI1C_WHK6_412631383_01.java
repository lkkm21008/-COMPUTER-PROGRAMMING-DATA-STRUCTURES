
package homework;
//讓使用者輸入n位同學分數，印出其平均分數、及格者平均，n由使用者輸入
import java.util.*;
public class MI1C_WHK6_412631383_01 {
    public static void main(String[] args) {
    Scanner cin=new Scanner(System.in);
        System.out.print("請輸入n位同學:");
        int n=cin.nextInt();
        int total=0, passtotal=0;
        int cnt=0;
        for(int i=1;i<=n;i++){  
            System.out.print("請輸入第"+i+"位同學的分數:");
              int score=cin.nextInt();
        total+=score;
          if(score>=60){
        passtotal +=score;
        cnt++;
        }
        }
         System.out.println("平均分數:"+total/n);
          System.out.println("及格者平均分數:"+passtotal/cnt);
          
    
    }
}
