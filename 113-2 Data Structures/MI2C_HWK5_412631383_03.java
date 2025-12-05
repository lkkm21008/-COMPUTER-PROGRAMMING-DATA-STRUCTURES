/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
class LinkedListWithHeader {
    private class Node {
        Object item;
        Node next;

        Node() {}

        Node(Object obj, Node n) {
            item = obj;
            next = n;
        }
    }

    private Node head;
    private int numItems;

    public LinkedListWithHeader() {
        head = new Node(); // 表頭節點，不存資料
        head.next = null;
        numItems = 0;
    }

    int size() {
        return numItems;
    }

    private Node find(int index) {
        Node cur = head;
        for (int i = 0; i <= index; i++)
            cur = cur.next;
        return cur;
    }

    public void add(Object item) {
        add(size(), item);
    }

    public void add(int index, Object item) {
        if (index < 0 || index > numItems) {
            System.out.println("add(): index out of bound: " + index);
            System.exit(1);
        }

        Node prev = head;
        for (int i = 0; i < index; i++)
            prev = prev.next;

        Node newNode = new Node(item, prev.next);
        prev.next = newNode;
        numItems++;
    }

    public Object remove(int index) {
        if (index < 0 || index >= numItems) {
            System.out.println("remove(): index out of bound: " + index);
            System.exit(1);
        }

        Node prev = head;
        for (int i = 0; i < index; i++)
            prev = prev.next;

        Node removed = prev.next;
        prev.next = removed.next;
        numItems--;
        return removed.item;
    }

    public String toString() {
        Node cur = head.next;
        String s = "[";
        while (cur != null) {
            s += cur.item;
            if (cur.next != null) s += ", ";
            cur = cur.next;
        }
        return s + "]";
    }
}

public class MI2C_HWK5_412631383_03{
    public static void main(String[] args) {
        LinkedListWithHeader list = new LinkedListWithHeader();
        list.add("Peter");
        list.add("Paul");
        list.add("Mary");
        System.out.println("list=" + list); // [Peter, Paul, Mary]

        list.add(0, "Sam");
        System.out.println("list=" + list); // [Sam, Peter, Paul, Mary]

        list.add(2, "Zebra");
        System.out.println("list=" + list); // [Sam, Peter, Zebra, Paul, Mary]

        list.remove(2);
        list.remove(3);
        list.add("Moto");
        System.out.println("list=" + list); // [Sam, Peter, Paul, Moto]
    }
}