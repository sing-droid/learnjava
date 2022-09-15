package javaprogramming;

public class LLRevrese {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = null;
        }
    }
        public void llReverse() {
            if (head == null || head.next == null) {
                return;
            }
            Node preview = head;
            Node currNode = head.next;
            while (currNode != null) {
                Node nextNode = currNode.next;
                currNode.next = preview;
                preview = currNode;
                currNode = nextNode;
            }
            head.next = null;
            head = preview;
        }

        public void adlist(int data) {
            Node n = new Node(data, null);
            if (head == null) {
                head = n;
                tail = n;
            } else {
                tail.next = n;
                tail = n;
            }


        }
        public void printlist(){
            if(head == null){
                System.out.println(" emppty ");
                return;
            }
        Node n = head;
        while(n != null){
            System.out.print(n.data+ " ");
            n = n.next;
        }
        }

    public static void main(String[] args) {
        LLRevrese list = new LLRevrese();
        list.adlist(1);
        list.adlist(2);
        list.adlist(3);
        list.printlist();
        list.llReverse();
        System.out.println();
        list.printlist();

    }
    }

