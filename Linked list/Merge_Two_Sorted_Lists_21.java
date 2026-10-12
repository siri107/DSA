// Merge Two Sorted Lists
// https://leetcode.com/problems/merge-two-sorted-lists/
public class Merge_Two_Sorted_Lists_21 {
    public static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            }
            else {
                temp.next=list2;
                list2 = list2.next;
            } 
            temp = temp.next;   
        }
        if(list1 != null){
            temp.next=list1;
        }
        else {
            temp.next = list2;
        }
        return dummy.next;
    }
    // time : O(n+m)
    // space : O(1)
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val < list2.val) {
            list1.next = mergeTwoLists1(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists1(list1, list2.next);
            return list2;
        }
    }
    // time : O(n+m)
    // space : O(n+m)
    public static void main(String[] args) {
        Merge_Two_Sorted_Lists_21 solution = new Merge_Two_Sorted_Lists_21();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = solution.mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();

        ListNode list3 = new ListNode(1, new ListNode(3));
        ListNode list4 = new ListNode(2, new ListNode(4));
        System.out.println(solution.mergeTwoLists1(list3, list4).val);
    }
}
