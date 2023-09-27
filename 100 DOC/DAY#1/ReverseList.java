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

    void reverse() {
        Node curr, prev, front;
        curr = head;
        prev = null;
        front = null;

        while (curr != null) {
            front = curr.next;
        curr.next = prev;
        prev = curr;
        curr = front;
        }

        head = prev;

    }

    void displayList() {
        Node tmp = head;
        while(tmp!=null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}

public class ReverseList {
    public static void main(String[] args) {
        List li = new List();
        for (int i = 10; i<=100; i+=10) {
            li.insert(i);
        }
        System.out.println("Before Reversing: ");
        li.displayList();
        li.reverse();
        System.out.println("After reversing: ");
        li.displayList();
    }
}