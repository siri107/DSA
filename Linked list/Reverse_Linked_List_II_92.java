// Reverse Linked List II
// lc link : https://leetcode.com/problems/reverse-linked-list-ii/description/
public class Reverse_Linked_List_II_92 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        for(int i=0 ; i<left-1 ; i++) {
            prev = prev.next;
        }
        
        ListNode current = prev.next;
        ListNode nextNode;

        for(int i=0 ; i<right-left ; i++) {
            nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }
        
        return dummy.next;  
    }
    // time : O(n)
    // space : O(1)
    public static void main(String[] args) {
        Reverse_Linked_List_II_92 solution = new Reverse_Linked_List_II_92();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        int left = 2, right = 4;
        ListNode modifiedHead = solution.reverseBetween(head, left, right);
        
        // Print the modified linked list
        ListNode current = modifiedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }  
}
