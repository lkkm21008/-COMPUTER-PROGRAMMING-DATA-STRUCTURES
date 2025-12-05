/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
    class Node {
    int item; // private int item ;
    Node next; // private Node next ;

    public Node() {
    }

    public Node(int newItem) {
        item = newItem;
        next = null;
    }

    public Node(int newItem, Node next) {
        item = newItem;
        this.next = next;
    }

    public void setItem(int newItem) {
        item = newItem;
    }

    public int getItem() {
        return item;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

//    public String toString() {
//        return String.valueOf(item);
//    }
    public String toString() {
        return "("+item+","+next+")" ;
    }
}
public class MI2C_HWK5_412631383_01 {
    Node head = null;

    public void add(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            Node p = head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(newNode);
        }
    }

    public void add(int index, int item) {
        if (index < 0 || index > size()) {
            System.out.println("add(): index out of bounds!");
            System.exit(1);
        }
        Node newNode = new Node(item);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node p = head;
            for (int i = 0; i < index - 1; i++) {
                p = p.getNext();
            }
            newNode.setNext(p.getNext());
            p.setNext(newNode);
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("get(): index out of bounds!");
            System.exit(1);
        }
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.getNext();
        }
        return p.getItem();
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("remove(): index out of bounds!");
            System.exit(1);
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node p = head;
            for (int i = 0; i < index - 1; i++) {
                p = p.getNext();
            }
            p.setNext(p.getNext().getNext());
        }
    }

    public int size() {
        int count = 0;
        Node p = head;
        while (p != null) {
            count++;
            p = p.getNext();
        }
        return count;
    }

    public void display(String msg) {
        System.out.print(msg);
        Node p = head;
        while (p != null) {
            System.out.print(p.getItem() + " ");
            p = p.getNext();
        }
        System.out.println();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node p = head;
        while (p != null) {
            sb.append(p.getItem());
            if (p.getNext() != null) sb.append(", ");
            p = p.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}