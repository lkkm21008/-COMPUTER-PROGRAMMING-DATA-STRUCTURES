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
class ListStack<T> {
    private ArrayList<T> data = new ArrayList<>();

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public boolean isFull() {
        return false; // ArrayList 沒有容量上限，所以永遠不滿
    }

    public void push(T x) {
        data.add(x);
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("堆疊為空，無法 pop");
        }
        return data.remove(data.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("堆疊為空，無法 peek");
        }
        return data.get(data.size() - 1);
    }

    public String toString() {
        return data.toString(); // 直接使用 ArrayList 的 toString() 方法
    }
}
public class MI2C_HWK3_412631383_04 {
     public static void main(String[] args) {
        ListStack<Integer> stk = new ListStack<>();
        for (int i = 1; i <= 10; i++) stk.push(i);
        System.out.println("stk=" + stk); // [1, 2, 3, ..., 10]

        for (int i = 1; i <= 10; i++) {
            int x = stk.pop();
            System.out.print("pop:" + x + " ");
        }
        System.out.println();
    }
}
