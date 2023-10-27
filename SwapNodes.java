public class SwapNodes {
    public static void SwapNode(Node head, int p, int q) {
        //logic to search p and q nodes---
        // Locate node with data value p
        Node ptr = head;
        Node prev = null;

        while (ptr != null && ptr.data != p) {
            prev = ptr;
            ptr = ptr.next;
        }
        Node ptr_p = ptr;
        Node prev_p = prev;

        // Locate node with data value q
        ptr = head;
        prev = null;

        while (ptr != null && ptr.data != q) {
            prev = ptr;
            ptr = ptr.next;
        }
        Node ptr_q = ptr;
        Node prev_q = prev;
        
        //swap the nodes---
        Node temp = ptr_q.next;
        ptr_q.next = ptr_p.next;
        ptr_p.next = temp;

        if (prev_p == null) {
            head = ptr_q;
        } 
        else {
            prev_p.next = ptr_q;
        }

        if (prev_q == null) {
            head = ptr_p;
        } 
        else {
            prev_q.next = ptr_p;
        }

        // Print the updated linked list
        Node ptr1 = head;
        while (ptr1 != null) {
            System.out.print(ptr1.data + "->");
            ptr1 = ptr1.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
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

        SwapNode(head,20,40);
}    
}
