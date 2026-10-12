//  Add Two Numbers
// lc link : https://leetcode.com/problems/add-two-numbers/description/
public class Add_Two_Numbers_2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode head = l1;
        ListNode prev=null;
        while (l1 != null || l2 != null) {
            if(l1 == null) {
                prev.next = new ListNode(0);
                l1 = prev.next;
            }    
            if(l2 == null)
                l2 = new ListNode(0);
            int sum = c + l1.val + l2.val;
            l1.val = sum%10;
            c = sum/10; 
            prev = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if ( c!=0) {
            prev.next = new ListNode(c);
        }
        return head;
    }
    // time : O(max(n,m))
    // space : O(1)
    
    public static void main(String[] args) {
        Add_Two_Numbers_2 solution = new Add_Two_Numbers_2();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        ListNode resultHead = solution.addTwoNumbers(l1, l2);
        
        // Print the resulting linked list
        ListNode current = resultHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
