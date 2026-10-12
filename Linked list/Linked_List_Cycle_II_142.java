// Linked List Cycle II
// lc link : https://leetcode.com/problems/linked-list-cycle-ii/description/
public class Linked_List_Cycle_II_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow) {
                slow = head;
                while (slow != fast) { 
                    slow = slow.next; 
                    fast = fast.next; 
                }
                return fast;
            }    
        }
        return null; 
    }
    // time : O(n)
    // space : O(1)
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        Linked_List_Cycle_II_142 solution = new Linked_List_Cycle_II_142();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Create a cycle

        ListNode cycleNode = solution.detectCycle(head);
        
        if (cycleNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected.");
        }
    } 
}
