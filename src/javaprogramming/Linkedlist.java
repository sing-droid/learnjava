package javaprogramming;

import java.util.Scanner;

public class Linkedlist {
    Node head;
    Node  tail;
    class Node{
        int data;
        Node  next;
        public Node( int data,Node next){
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        Linkedlist list = new Linkedlist();
        for(int i=0; i<n; i++){
            int var = sc.nextInt();
            list.add(var);
        }
        //list.newNode(x);
       // list.print();
        list.addinmenthod(x,5);
        list.print();


    }

    private void print() {
        Node var = head;
        while(var != null){
            System.out.print(var.data);
            var = var.next;
        }

    }

    private void add(int var) {
        Node node = new Node(var,null);
        if(head==null){
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }

    }
    public void newNode(int data){
        Node node = new Node(data,null);
        node.next = head;
        head = node;
    }
    public void addinmenthod(int data, int pos){
        Node node = new Node(data, null);
        Node node1 = head;
        int i=1;
        while(i<pos-1){
            i++;
            node1 = node1.next;
        }
        node.next = node1.next;
        node1.next = node;
    }


}
