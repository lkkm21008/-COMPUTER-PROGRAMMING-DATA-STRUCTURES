
package homework;

//將陣列a[]與b[]的內容反序儲存在原陣列中，之後印出內容。
import java.util.*;
public class MI1C_HWK9_412631383_03 {
    public static void main(String[] args) {
      int [] a={3,5,7,9}; int [] b={4,7,8,9,15,13,22};
      for(int i =0;i<a.length/2;i++){
      int temp=a[i];
      a[i]=a[a.length-1-i];
      a[a.length-1-i]=temp;
      }
          System.out.println("a[]="+Arrays.toString(a));   
      for(int i =0; i<b.length/2;i++){
      int temp=b[i];
      b[i]=b[b.length-1-i];
      b[b.length-1-i]=temp;
      }
        System.out.println("b[]="+Arrays.toString(b));
      }
    }
