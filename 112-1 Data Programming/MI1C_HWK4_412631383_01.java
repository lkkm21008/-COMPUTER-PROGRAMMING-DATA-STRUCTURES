/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.*;
public class MI1C_HWK4_412631383_01 {
     public static void main(String[] args) {
     Scanner cin=new Scanner(System.in);
        System.out.print("score=");
        int score=cin.nextInt();
        if(score>=80 && score<=100){ //[80,100]
            System.out.println("excellent");
        }else if (score>=60){ //<80,[60,80],複合條件->防衛過當
            System.out.println("good");
        }else if (score>=50 ){ //[50,60]
            System.out.println("marginal");
        }else if (score>=0){
            System.out.println("try again");
        }else{
            System.out.println("wrong input");
        }
    }
}
