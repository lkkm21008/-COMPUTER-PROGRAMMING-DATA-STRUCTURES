
package homework;

import java.util.*;
public class MI1C_HWK4_412631383_05 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.print("請輸入n的值:");
        int n =cin.nextInt();
        int cnt=1;
        int sum=0;
        int count=0;
    while(cnt<=n){
cnt=cnt+2;
count=count+1;
sum=((2+n)*count)/2;
    }
        System.out.println("sum="+sum);
    }
}
