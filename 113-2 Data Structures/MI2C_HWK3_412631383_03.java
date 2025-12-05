/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */

class GenericStack<T> {
    private final int MAX_LIST = 10;
    private T[] items;
    private int top;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        items = (T[]) new Object[MAX_LIST]; // Java 不允許直接建立泛型陣列
        top = 0;
    }

    public void push(T item) {
        if (top == MAX_LIST) {
            throw new StackOverflowError("堆疊已滿");
        }
        items[top++] = item;
    }

    public T pop() {
        if (top == 0) {
            throw new EmptyStackException();
        }
        return items[--top];
    }

    public T peek() {
        if (top == 0) {
            throw new EmptyStackException();
        }
        return items[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < top; i++) {
            sb.append(items[i]);
            if (i < top - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
public class MI2C_HWK3_412631383_03 {
        public static void main(String[] args) {
     
	GenericStack<String> stk = new GenericStack<>() ;
	stk.push("Peter"); stk.push("Paul"); stk.push("Mary") ;
        System.out.println("stk="+stk); // [Peter, Paul, Mary]       
        
	String s = stk.pop() ; System.out.println(s) ; // Mary
	System.out.println("peek()="+stk.peek()) ; // Paul
	System.out.println("size()="+stk.size()) ; // 2
       
    }
}
