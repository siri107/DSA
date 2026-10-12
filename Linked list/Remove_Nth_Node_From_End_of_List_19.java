// Remove Nth Node From End of List
// link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class Remove_Nth_Node_From_End_of_List_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        if(temp.next == null && n==1) {
            head = head.next;
            return head;
        }
        int c = 1;
        ListNode q=null;
        while(temp.next != null) {
            if(c < n)
                q = null;
            else if(c == n)
                q = head;
            else
                q = q.next;
            temp = temp.next;
            c++;
        }
        if (q == null) { head = head.next; return head; }
        q.next = q.next.next;
        return head;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    // time : O(n)
    // space : O(1)
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advance first pointer by n+1 steps to maintain a gap of n between first and second
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        // Skip the desired node
        second.next = second.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        Remove_Nth_Node_From_End_of_List_19 solution = new Remove_Nth_Node_From_End_of_List_19();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;
        ListNode result = solution.removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
        // Testing the second method
        head = new ListNode(1); 
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);   
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        result = solution.removeNthFromEnd2(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
