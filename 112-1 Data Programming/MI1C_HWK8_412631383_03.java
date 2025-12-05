
package homework;
import java.util.*;
public class MI1C_HWK8_412631383_03 {
    public static void main(String[] args) {
        Random r=new Random(111);
        int point[]=new int [100];
        int lb=1,ub=6;
        int cnt[]=new int [6];
      for(int i=0;i< point.length;i++){
         point[i]=lb+r.nextInt( ub- lb+1);
              switch(point[i]){
                  case 1:
                      cnt[0]++;
                    break;
                    case 2:
                      cnt[1]++;
                    break;
                    case 3:
                      cnt[2]++;
                    break;
                    case 4:
                      cnt[3]++;
                    break;
                    case 5:
                      cnt[4]++;
                    break;
                    case 6:
                      cnt[5]++;
                    break;
         }
         }
         System.out.println("points="+Arrays.toString(point));
          System.out.print("cnt=");
         for(int j=0;j<6;j++){
             System.out.print(cnt[j]);
             if (j < cnt.length - 1) {
        System.out.print(",");
    }
         }
        }
    
        } 
       
        
