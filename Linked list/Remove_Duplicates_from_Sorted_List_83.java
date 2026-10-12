// Remove Duplicates from Sorted List

public class Remove_Duplicates_from_Sorted_List_83 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    // time : O(n)
    // space : O(1)
    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    // time : O(n)
    // space : O(1)
    public static void main(String[] args) {
        Remove_Duplicates_from_Sorted_List_83 solution = new Remove_Duplicates_from_Sorted_List_83();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = solution.deleteDuplicates1(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();

        ListNode result1 = solution.deleteDuplicates(head);
        while (result1 != null) {
            System.out.print(result1.val + " ");
            result1 = result1.next;
        }
    }
}