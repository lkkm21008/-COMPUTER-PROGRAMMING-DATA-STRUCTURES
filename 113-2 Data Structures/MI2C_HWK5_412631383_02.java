/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
import java.util.* ;
public class MI2C_HWK5_412631383_02 {        
public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>() ;
        for (int i = 0 ; i < 10; i++)
            list.add((int)(Math.random() * 101) - 50); // -50 ~ 50

        System.out.println("list = " + list);

        int sum = sumUpList(list) ;
        System.out.println("sum = " + sum);

        LinkedList<Integer> posList = positiveList(list) ;
        System.out.println("posList = " + posList) ;
    }	

    public static int sumUpList(LinkedList<Integer> L) {
        int sum = 0;
        for (int x : L) {
            sum += x;
        }
        return sum;
    }

    public static LinkedList<Integer> positiveList(LinkedList<Integer> L) {
        LinkedList<Integer> posList = new LinkedList<>();
        for (int x : L) {
            if (x > 0)
                posList.add(x);
        }
        return posList;
    }
}

