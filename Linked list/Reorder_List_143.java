public class Reorder_List_143 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev= null;
        ListNode current = slow.next;
        slow.next = null;
        
        while(current != null) {
            ListNode next= current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode first = head;
        ListNode second = prev;
        ListNode firstnext ;
        ListNode secondnext;
        while (first != null && second !=null) {
            firstnext = first.next;
            secondnext = second.next;
            first.next = second;
            second.next = firstnext;
            first = firstnext;
            second = secondnext;
        }
        
    }
    // time : O(n)
    // space : O(1)
    public static void main(String[] args) {
        Reorder_List_143 solution = new Reorder_List_143();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        solution.reorderList(head);

        // Print the reordered linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
