
package homework;

import java.util.*;
public class MI1C_HWK3_412631383_02 {
    public static void main(String[] args) {
         Scanner cin =new Scanner(System.in);
        System.out.print("請輸入學號:");
        int id =cin.nextInt(); //輸入學號: 如:108523027
        int degree; //學號第五碼:0:大學部2:研究所 (假設沒有其他編號)
        int year,dep,rank; //入學學分:108 系所代碼:523 入學名次:127
        degree=id/10000%10;
        year=id/1000000%1000;
        dep=id/1000%1000;
        rank=id%1000;
        if(degree==0){
            System.out.println("Degree:大學部");
        
    }else{
            System.out.println("Degree:研究所");
        }
                 System.out.println("Year:"+year);
                 System.out.println("Dept:"+dep);
                 System.out.println("Rank:"+rank);
    }
}
