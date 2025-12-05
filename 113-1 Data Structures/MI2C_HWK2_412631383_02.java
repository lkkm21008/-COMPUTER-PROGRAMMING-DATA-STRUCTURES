/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
import java.util.*;
public class MI2C_HWK2_412631383_02 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("First dose, y/m/d=");
        int year=cin.nextInt(); int month=cin.nextInt(); int day=cin.nextInt();
        dose(year,month,day);
    }
    public static void dose(int year,int month,int day){
    int d2=(day+56)%30;
    int m2=month+(day+56)/30;
    int y2= year+m2/12;
     System.out.println("Date of second dose:"+y2+"/"+m2+"/"+d2);
    }
}
