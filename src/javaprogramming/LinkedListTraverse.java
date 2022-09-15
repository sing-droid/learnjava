package javaprogramming;

import java.util.Scanner;

public class LinkedListTraverse {
    Node head;
    Node tail;

    public class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = null;
        }
    }
    public void printlist(){
        Node n = head;
        while (n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }
    public void add(int element){
        Node n = new Node(element,null);
        if(head == null){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
    }

    public static void main(String[] args) {
        LinkedListTraverse list = new LinkedListTraverse();
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        for(int i = 0; i<size; i++){
            int element = sc.nextInt();
            list.add(element);

        }
        list.printlist();
    }
}
