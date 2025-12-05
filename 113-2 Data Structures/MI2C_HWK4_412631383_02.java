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
    int item;
    Node next;

    public Node() {}

    public Node(int newItem) {
        item = newItem;
        next = null;
    }

    public Node(int newItem, Node next) {
        item = newItem;
        this.next = next;
    }

    @Override
    public String toString() {
        return "(" + item + "," + next + ")";
    }
}

class IntLinkedList { // 整數版Linked List
    Node head = null;
    int numItems = 0;

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int size() {
        return numItems;
    }

    public void add(int item) { 
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        numItems++;
    }

    double average() {
        if (numItems == 0) return 0.0;
        int sum = 0;
        Node curr = head;
        while (curr != null) {
            sum += curr.item;
            curr = curr.next;
        }
        return (double) sum / numItems;
    }

    IntLinkedList getPos() {
        IntLinkedList posList = new IntLinkedList();
        Node curr = head;
        while (curr != null) {
            if (curr.item > 0) {
                posList.add(curr.item);
            }
            curr = curr.next;
        }
        return posList;
    }

    void display(String msg) { 
        System.out.print(msg);
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.item);
            if (curr.next != null) {
                System.out.print("->");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    @Override
    public String toString() { 
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        while (curr != null) {
            sb.append(curr.item);
            if (curr.next != null) {
                sb.append("->");
            }
            curr = curr.next;
        }
        return sb.toString();
    }
}

public class MI2C_HWK4_412631383_02 {
    public static void main(String[] args) {
        IntLinkedList L1 = new IntLinkedList();
        int[] data = {18, 23, -5, 10, -8, 54};
        for (int x : data) {
            L1.add(x);
        }
        System.out.println("L1=" + L1.head); // L1=(18,(23,(-5,(10,(-8,(54,null))))))
        L1.display("L1="); // L1=18->23->(-5)->10->(-8)->54

        System.out.println("avg of L1=" + L1.average()); // 15.333

        IntLinkedList L2 = L1.getPos();
        L2.display("L2=L1.getPos()="); // L2=18->23->10->54
    }
}