class Node {
        int data;
        Node next;
    
        Node(int x) {
            data = x;
            next = null;
        }
    }
public class detectLoop {
        public static Node loopStartNode(Node head) {
            if (head == null)
                return null;
            Node slow = head;
            Node fast = head;
            if (slow != fast)
                return null;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    break;
                }
            }
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
    
        }
    
        public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
            head.next.next.next.next = new Node(50);
            head.next.next.next.next.next = head.next.next;
            Node n1 = loopStartNode(head);
            if (loopStartNode(head) != null) {
                System.out.println("Loop is detected at the Node" + " " + n1.data);
            } else {
                System.out.println("Loop is not detected");
            }
    
        }
    }

