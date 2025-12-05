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

class SortedList2<T extends Integer> extends ArrayList<T> {	
    public SortedList2() { super(); }

    public boolean add(T item) {
        int index = 0;
        while (index < size() && get(index) < item) {
            index++;
        }
        super.add(index, item);
        return true; // 請勿刪除此行
    }

    public void remove(T item) { super.remove(item); }

    public String toString() { return super.toString(); }
}
public class MI2C_HWK3_412631383_01 {
        public static void main(String[] args) {
        SortedList2<Integer> SL1 = new SortedList2<>(); // 確保類別名稱正確
        SL1.add(18);
        SL1.add(10);
        SL1.add(15);
        SL1.add(4);
        SL1.add(13);
        System.out.println("SL1=" + SL1); // 預期輸出: SL1=[4, 10, 13, 15, 18]
    }
}
