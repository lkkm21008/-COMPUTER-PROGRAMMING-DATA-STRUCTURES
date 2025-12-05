
package homework;

import java.util.Arrays;
public class MI1C_HWK8_412631383_01 {
    public static void main(String[] args) {
        int [] a=new int[11];
       a[0]=1;
        for(int i =1;i<a.length;i++){
        a[i]=2*a[i-1]+1;
        }
        System.out.println("a0~a10="+Arrays.toString(a));
        
    }
}
