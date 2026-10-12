// Reverse Linked List
// lc link : https://leetcode.com/problems/reverse-linked-list/description/


public class Reverse_Linked_List_206 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        // if(head==null)
        //     return null;
        // if(head.next==null)
        //     return head;
        ListNode prev= null;
        ListNode current = head;
        
        while(current != null) {
            ListNode next= current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    // time : O(n)
    // space : O(1)
    public static void main(String[] args) {
        Reverse_Linked_List_206 solution = new Reverse_Linked_List_206();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        ListNode reversedHead = solution.reverseList(head);
        
        // Print the reversed linked list
        ListNode current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    } 
}
