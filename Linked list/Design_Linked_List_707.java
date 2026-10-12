

public class Design_Linked_List_707 {
    class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val= val;
            this.next= null;
        }
    }
    Node head;
    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        if(index < 0) 
            return -1;
        Node temp = head;
        for( int i=0; i<index ;i++) {
            if(temp == null)
                return -1;
            temp = temp.next;
        }
        if(temp == null)
            return -1;
        return temp.val; 
    }
    
    public void addAtHead(int val) {
        Node newnode = new Node(val);
        newnode.next=head;
        head = newnode;
    }
    
    public void addAtTail(int val) {
        if(head==null){
            head = new Node(val);
            return;
        }
        Node temp= head;
        while(temp.next != null)
            temp=temp.next;
        temp.next = new Node(val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0)
            return;
        if(index==0) {
            Node newnode = new Node(val);
            newnode.next = head;
            head = newnode;
            return;
        }
        Node temp=head;
        for(int i=0 ;i <index-1 ;i++) {
            if(temp==null)
                return;
            temp= temp.next;
        }
        if(temp==null)
            return;
        Node newnode = new Node(val);
        newnode.next = temp.next;
        temp.next = newnode;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0)
            return;
        if(index == 0) {
            if(head != null)
                head = head.next;
            return;
        }
        Node temp=head;
        for(int i=0 ;i <index-1 ;i++) {
            if(temp==null)
                return;
            temp= temp.next;
        }
        if(temp==null || temp.next==null)
            return;
        Node q= temp.next;
        temp.next=q.next;
        q.next=null;
        
    }
}
    // time : O(n)
    // space : O(1)
    public static void main(String[] args) {
        MyLinkedList linkedList = new Design_Linked_List_707().new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);   // linked list becomes 1->2->3
        System.out.println(linkedList.get(1));            // returns 2
        linkedList.deleteAtIndex(1);    // now the linked list is 1->3
        System.out.println(linkedList.get(1));            // returns 3
    }
}
