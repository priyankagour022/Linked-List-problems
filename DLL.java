public class DLL {
    Node head;

    private class Node {
        int val;
        Node next;
        Node pre;

        // constructor-->used for initialize the value.
        Node(int val) {
            this.val = val;
        }
    }

    // insert Node At begining-->
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.pre = null;
        if (head != null) {
            head.pre = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + "->");
            last = node;
            node = node.next;

        }
        System.out.println("END");
        System.out.println();
        System.out.println("Print LL in Reverse ");
        System.out.println();

        while (last != null) {
            System.out.print(last.val + "->");
            last = last.pre;
        }
        System.out.println("START");
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.pre = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.pre = last;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node curr = find(after);
        if (curr == null) {
            System.out.println("Dose not Exist");
            return;
        }
        Node node = new Node(val);
        node.next = curr.next;
        curr.next = node;
        node.pre = curr;
        if (node.next != null) {
            node.next.pre = node;
        }
    }

}
