class Node {
    int value;
    Node next; //Reference to the next node object

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class List {
    Node root;
    // int size;

    List() {
        root = null;
    }

    void insert(int val) {
        if (root == null) {
            root = new Node(val);
        }
        Node tmp = root;
        while (tmp.next !=null) {
            tmp = tmp.next;
        }
        Node temp = new Node(val);
        tmp.next = temp;
    }

    //delete first
    public void deleteFirst(){
        if(root==null){
            System.out.println("the list is empty");
            return;
        }
        root = root.next;
    }

    //delete last
    public void deleteLast(){
        if(root==null){
            System.out.println("the list is empty");
            return;
        }

        if(root.next == null){
            root = null;
            return;
        }
        Node secondLast = root;
        Node lastNode = root.next;
        while (lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next=null;
    }

    void display() {
        Node temp = root.next;
        while (temp!=null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}

public class LinkedList {
    public static void main(String[] args) {
        List li = new List();
        for (int i = 0; i<10; i++) {
            li.insert(i);
        }
        li.display();
    }
}
