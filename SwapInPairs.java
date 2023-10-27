class Node {
    int data;
    Node next;

    public Node(int x) {
        data = x;
        
    }
}
class SwapInPairs {
    public static void swapInPairs(Node head){
        Node temp = new Node(0);
        temp.next = head;
        Node prev = temp;
        while(prev != null && prev.next != null && prev.next.next != null){
           Node first = prev.next;
           Node second = prev.next.next;

           first.next = second.next;
           second.next = first;
           prev.next = second;

           prev = first;
        }

        Node ptr = temp.next;
        while(ptr!= null){
            System.out.print(ptr.data+ "->");
            ptr = ptr.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
       Node head = new Node(10);
       head.next = new Node(20);
       head.next.next = new Node(30);
       head.next.next.next = new Node(40);
       head.next.next.next.next = new Node(50);
       head.next.next.next.next.next = new Node(60);


       Node ptr = head;
       while(ptr!= null){
         System.out.print(ptr.data+ "->");
         ptr = ptr.next;
       }
       System.out.println("null");
    
       swapInPairs(head);

       
    }
}
