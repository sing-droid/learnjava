package javaprogramming;

import org.w3c.dom.Node;

public class LLadd {
    Node head;
    Node tail;
    private int size;

    LLadd() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void adList(int data) {
        Node n = new Node(data, null);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }

    }

    public void printlist() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void insertfirst(int data, Node next) {
        Node n = new Node(data, null);
        if (head == null) {
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }

    public void insertAtLast(int data, Node next) {
        Node n = new Node(data, null);
        if (head == null) {
            head = n;
            return;
        }
        Node i = head;
        while (i.next != null) {
            i = i.next;
        }
        i.next = n;
    }

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        size--;
        head = head.next;
        return;
    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        size--;
        Node secondLast = head;
        Node last = secondLast.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LLadd list = new LLadd();
        list.adList(2);

        list.adList(3);
        list.adList(4);
        System.out.println(" after added an element in list :- ");
        list.printlist();
        System.out.println();
        list.insertfirst(1, null);
        list.printlist();
        System.out.println(" after added an element at first node in list :- ");
        list.insertAtLast(5, null);
        list.printlist();

        System.out.println(" after added an element at last node in list :- ");

        System.out.println("list printted : ");
        list.printlist();
        System.out.println();
        System.out.println(" delete at first : ");
        list.deleteAtFirst();
        list.printlist();

        System.out.println(" after deleted list : ");
        list.printlist();
        System.out.println(" delete at last");
        list.deleteAtLast();
        System.out.println(" after delete at last : ");
        list.printlist();
        System.out.println(" over");
        System.out.println(list.getSize());
    }
}
