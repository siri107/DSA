// Reverse Nodes in k-Group
// Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
// k is a positive integer and is less than or equal to the length of the linked list
// If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
// lc: https://leetcode.com/problems/reverse-nodes-in-k-group/

public class Reverse_Nodes_in_k_Group_25 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        ListNode temp = head;
        ListNode prevtail = null;
        while(temp != null) {
            ListNode current = temp;
            ListNode h = current;
            for (int i=0 ; i<k ; i++) {
                if(temp == null) {
                    return head;
                }   
                temp = temp.next;
            }
            ListNode prev = null;
            while(current != temp) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            if(prevtail==null)
                head = prev;
            else
                prevtail.next = prev;
            h.next = temp;
            prevtail = h; 
        }
        return head;   
    }
    // time : O(n)
    // space : O(1)
    public static void main(String[] args) {
        Reverse_Nodes_in_k_Group_25 solution = new Reverse_Nodes_in_k_Group_25();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        int k = 2;
        ListNode modifiedHead = solution.reverseKGroup(head, k);
        
        // Print the modified linked list
        ListNode current = modifiedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }   
    }
}
