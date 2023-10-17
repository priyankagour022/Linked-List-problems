class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
public class detectLoop2 {
    public static boolean loopDetect(Node head) {
        if (head == null)
            return false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head.next;
        if (loopDetect(head)) {
            System.out.println("Loop is detected");
        } else {
            System.out.println("Loop is not detected");
        }
    }
}
