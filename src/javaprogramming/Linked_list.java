package javaprogramming;

import java.util.Scanner;

public class Linked_list {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        public Node(int data, Node next){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Linked_list list = new Linked_list();
        for(int i=0; i<n; i++){
            int input = sc.nextInt();
            list.add(input);
        }
        list.print();//1 2 3
    }
    public  void add(int data){
        Node varl = new Node(data,null);
        if(head == null){
            head = varl;
            tail = varl;
        }
        else {
            tail.next = varl;
            tail = varl;
        }

    }
    public void print(){
        Node node = head;
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

}
