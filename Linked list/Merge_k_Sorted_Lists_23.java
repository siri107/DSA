// Merge k Sorted Lists
// lc link : https://leetcode.com/problems/merge-k-sorted-lists/description/

import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists_23 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        
        for (ListNode list : lists) {
            if (list != null) {
                pq.offer(list);
            }
        }
        
        while(!pq.isEmpty()) {
            ListNode node = pq.poll();
            temp.next = node;
            temp = temp.next;
            if(node.next != null)
                pq.offer(node.next);
        }  
        return dummy.next; 
    }
    // time : O(nlogk) where n is total number of nodes and k is number of lists
    // space : O(k)
    public static void main(String[] args) {
        Merge_k_Sorted_Lists_23 solution = new Merge_k_Sorted_Lists_23();
        
        ListNode[] lists = new ListNode[3];
        
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);
        
        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);
        
        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);
        
        ListNode mergedHead = solution.mergeKLists(lists);
        
        // Print the merged linked list
        ListNode current = mergedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
