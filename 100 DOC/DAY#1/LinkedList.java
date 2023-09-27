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

    }

    int deleteAtIndex(int key) {
        return 0;
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
        list.displayList();
    }
}