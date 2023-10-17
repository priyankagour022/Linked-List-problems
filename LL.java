class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    static Node head;
    public static void main(String[] args) {
        
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        traverse();
        insertAtBeg(80);
        System.out.println();
        traverse();
        insertAtEnd(90);
        System.out.println();
        traverse();
        insertAtPos(4,100);
        System.out.println();
        traverse();
        deleteEnd();
        System.out.println();
        traverse();
        deleteAtPos(2);
        System.out.println();
        traverse();
        System.out.println();
        middleNode();
        boolean result = search(500);
        System.out.println(result);
        
       
    }
    //insert
    public static void insert(int data){
    
        Node temp = new Node(data);
        if(head==null)
            head = temp;
        else{
            Node ptr = head;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            ptr.next = temp;
        }
    }
    //traverse 
    public static void traverse(){
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
    //insert at Beg
    public static void insertAtBeg(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    //insert at end
    public static void insertAtEnd(int data){
        Node temp = new Node(data);
        Node ptr = head;
        while(ptr.next!=null){
            ptr = ptr.next;
        }
         ptr.next = temp;
    }
    //insert At Position
    public static void insertAtPos(int pos, int data){
        Node temp = new Node(data);
        Node ptr = head;
        if(pos==0){
            temp.next = head;
            head = temp;
        }
        else{
            while(pos>1){
            ptr = ptr.next;
            pos--;
        }
        temp.next = ptr.next;
        ptr.next = temp;
        }
    }
    //delete from begning
    public static void deleteBeg(){
        head = head.next;

    }
    //delete from end
    public static void deleteEnd(){
        Node ptr = head;
        while(ptr.next.next!=null){
            ptr = ptr.next;
        }
        ptr.next = null;
    }
    //Delete At given position
    public static void deleteAtPos(int pos){
        Node ptr = head;
        if(pos==0)
           head = head.next;
        else{
            while(pos>1 && ptr!=null){
                pos--;
            }
            ptr.next.next = ptr.next.next.next;
        }

    }
    //middle node
    public static void middleNode(){
       Node slow = head;
       Node fast = head;
       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;

       }
       System.out.println(slow.data);
    }
    //search an element
    public static boolean search(int key){
        Node ptr = head;
        while(ptr!=null){
            if(ptr.data==key){
                return true;
            }
            else{
                ptr = ptr.next;
            }
        }
        return false;
    }
   
}
