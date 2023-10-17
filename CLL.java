public class CLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insert(3);
        list.insert(17);
        list.insert(8);
        list.insert(12);
        list.insert(10);
        list.display();
        list.delete(17);
        list.display();
    }

}

class DLL {
    private Node head;
    private Node tail;

    DLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;

    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + "->");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");

    }

    public void delete(int val) {
        Node node = head;
        if (node == null)
            return;

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node curr = node.next;
            if (curr.val == val) {
                node.next = curr.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }

    class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

}
