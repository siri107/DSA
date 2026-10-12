// Remove Linked List Elements
// link: https://leetcode.com/problems/remove-linked-list-elements/
public class Remove_Linked_List_Elements_203 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next= head;
        ListNode temp = dummy;
        while(temp.next != null) {
            if(temp.next.val == val) {
                temp.next=temp.next.next;
            }
            else
                temp = temp.next;
        }
        return dummy.next;
    }
    // time : O(n)
    // space : O(1)
    public static void main(String[] args) {
        Remove_Linked_List_Elements_203 solution = new Remove_Linked_List_Elements_203();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int valToRemove = 6;
        ListNode result = solution.removeElements(head, valToRemove);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
