// Linked List Cycle
// lc link : https://leetcode.com/problems/linked-list-cycle/description/

public class Linked_List_Cycle_141 {
    public static class ListNode {
        private final int val;
        ListNode next;
        ListNode(int x) { this.val = x; }
        public int getVal() {
            return val;
        }
    }
    // using two pointer slow and fast
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow)
                return true;
        }
        return false;  
    } 
    // time : O(n)
    // space : O(1)
    // using hashset
    public boolean hasCycle1(ListNode head) {
        java.util.HashSet<ListNode> set = new java.util.HashSet<>();
        while(head != null) {
            if(!set.add(head))
                return true;
            head=head.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Linked_List_Cycle_141 solution = new Linked_List_Cycle_141();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Create a cycle
        
        boolean hasCycle = solution.hasCycle(head);
        System.out.println(hasCycle); // Output: true
        boolean hasCycle1 = solution.hasCycle1(head);
        System.out.println(hasCycle1); // Output: true
    }
}
