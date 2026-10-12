// Odd Even Linked List
// lc link : https://leetcode.com/problems/odd-even-linked-list/description/
public class Odd_Even_Linked_List_328 {
    public ListNode oddEvenList(ListNode head) {
        if(head== null || head.next == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode list = even;
        while(even != null && even.next !=null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = list;
        return head;
    }
    // time : O(n)
    // space : O(1)
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        Odd_Even_Linked_List_328 solution = new Odd_Even_Linked_List_328();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        ListNode modifiedHead = solution.oddEvenList(head);
        
        // Print the modified linked list
        ListNode current = modifiedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
