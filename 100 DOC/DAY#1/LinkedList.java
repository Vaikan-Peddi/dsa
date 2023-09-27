// Java Program to implement Single Linked List

class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }

    Node() {
        this.data = 0;
        this.next = null;
    }

}

class List {
    Node head;

    void insert(int val) {
        Node tmp = new Node(val);
        if (this.head == null) {
            head = tmp;
        }
        else {
            Node i = head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = tmp;
        }
    }

    void prepend(int val) {
        if (head != null) {
            Node tmp = new Node(val);
            tmp.next = head;
            head = tmp;
        }
    }

    void insertAtIndex(int key, int val) {
        //Assuming it is possible
        if (key == 0) {
            prepend(val);
        }
        else {
            Node tmp = head;
            Node newNode = new Node(val);
            for (int i=0; i<key-1; i++) {
                tmp = tmp.next;
            }
            newNode.next = tmp.next;
            tmp.next = newNode;
        }
    }

    int deleteAtIndex(int key) {
        Node tmp = head;
        if (key == 0) {
            int x = head.data;
            head = head.next;
            return x;
        }
        else {
            for (int i=0; i<key-1; i++) {
                tmp = tmp.next;
            }
            int x = tmp.next.data;
            tmp.next = tmp.next.next;
            return x;
        }
    }

    void displayList() {
        Node tmp = head;
        while(tmp!=null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}

public class LinkedList {
    public static void main(String[] args) {
        System.out.println("Hello World");
        List list = new List();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.prepend(40);
        list.prepend(50);
        list.insertAtIndex(3, 100);
        list.deleteAtIndex(3);
        list.displayList();
    }
}