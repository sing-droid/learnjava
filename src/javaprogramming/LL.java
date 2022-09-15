package javaprogramming;

public class LL {
    Node head;

    class Node {
        int dat;
        Node next;

        Node(int dat) {
            this.dat = dat;
            this.next = null;
        }
    }

    public void addFirst(int dat) {
        Node newNode = new Node(dat);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.dat + " ");
            currNode = currNode.next;
        }

    }

    public void insertLast(int dat) {
        Node newNode = new Node(dat);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
       // list.printList();
        list.insertLast(4);
        list.printList();

    }

}
