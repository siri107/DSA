// Palindrome Linked List
//Palindrome Linked List

public class Palindrome_Linked_List_234 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev2= null;
        ListNode current = slow;
        
        while(current != null) {
            ListNode next= current.next;
            current.next = prev2;
            prev2 = current;
            current = next;
        }
        ListNode prev1 = head;
        while(prev2 !=null) {
            if(prev1.val != prev2.val) {
                return false;
            }
            prev1 = prev1.next;
            prev2 = prev2.next;
        }
        return true;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public static void main(String[] args) {
        Palindrome_Linked_List_234 solution = new Palindrome_Linked_List_234();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(solution.isPalindrome(head)); // Output: true    
        
    }
}
