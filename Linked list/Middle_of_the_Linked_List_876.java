// Middle of the Linked List
// lc link : https://leetcode.com/problems/middle-of-the-linked-list/description/
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Middle_of_the_Linked_List_876 {
    // approch 1: using two pointer slow and fast
    public ListNode middleNode(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        while(fast != null && fast.next != null) {
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    // time : O(n)
    // space : O(1)
    // approch 2: using length of linked list
    public ListNode middleNode1(ListNode head) {
        ListNode temp = head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        } 
        int mid=(int) c/2;
        
        temp= head;
        
        for(int i=0 ; i< mid ;i++)
            temp=temp.next;
        while(temp!=null) {
            return temp;
        } 
        return head;  
    }
    // time : O(n)
    // space : O(1)
    public static void main(String[] args) {
        Middle_of_the_Linked_List_876 solution = new Middle_of_the_Linked_List_876();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        ListNode middle = solution.middleNode(head);
        System.out.println(middle.val); // Output: 3
        ListNode middle1 = solution.middleNode1(head);
        System.out.println(middle1.val); // Output: 3
    }
}
