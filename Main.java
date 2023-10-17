class Node {
    int data;
    Node next;

    public Node(int x) {
        data = x;
        
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Appending nodes to the linked list
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        // Printing the linked list
        System.out.print("Linked List: ");
        linkedList.printList();
    }
}
/*public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
            head.next.next.next.next = new Node(50);
            Node ptr = head;
            while(ptr!=null){
                System.out.print(ptr.data+"->");
                ptr = ptr.next;
            }
            System.out.print("null");
            System.out.println();

            SwapNode(head,10,40);
    }
    */