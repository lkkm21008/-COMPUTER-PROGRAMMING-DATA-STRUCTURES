
package homework;

import java.util.*;
public class MI1C_HWK8_412631383_02 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int[]a=new int[50];
      double sum=0,avg,s,x1,x2=1,v;  
      double sum1 = 0  ;
      Random r=new Random(111);
     for(int i =0;i<a.length;i++){
        a[i]=r.nextInt(101);
        sum +=a[i];
        }
      for(int j=0;j<a.length;j++){
        x2=Math.pow(a[j], 2);
        sum1 +=x2;
        }
       v=((50* sum1) - Math.pow(sum, 2)) / (50 * 49);
        s=Math.sqrt(v);
        System.out.println("score="+Arrays.toString(a));
         avg=sum/a.length;
        System.out.println("平均="+avg);
        System.out.printf("標準差%.3f\n",s);

    }          
}
