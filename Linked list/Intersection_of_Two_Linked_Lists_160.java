// Intersection of Two Linked Lists
// lc link : https://leetcode.com/problems/intersection-of-two-linked-lists/description/

public class Intersection_of_Two_Linked_Lists_160 {
    public static class ListNode {
        private final int val;
        ListNode next;
        ListNode(int x) { this.val = x; }
        public int getVal() {
            return val;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1= headA;
        
        while(temp1 != null)
        {
            ListNode temp2= headB;
            while(temp2 != null) {
                if(temp1.val==temp2.val && temp1 == temp2)
                    return temp2;
                temp2= temp2.next;
            }
            temp1 = temp1.next;
        }
        return null;
    }
    // time : O(n*m)
    // space : O(1)
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

    ListNode p1 = headA;
    ListNode p2 = headB;

    while (p1 != p2) {

        if (p1 == null)
            p1 = headB;
        else
            p1 = p1.next;

        if (p2 == null)
            p2 = headA;
        else
            p2 = p2.next;
    }

    return p1;
}
    public static void main(String[] args) {
        Intersection_of_Two_Linked_Lists_160 solution = new Intersection_of_Two_Linked_Lists_160();
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        ListNode intersection = new ListNode(8);
        headA.next.next = intersection;
        intersection.next = new ListNode(4);
        intersection.next.next = new ListNode(5);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersection;

        ListNode result = solution.getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersection at node with value: " + result.getVal());
        } else {
            System.out.println("No intersection.");
        }
        ListNode result1 = solution.getIntersectionNode1(headA, headB);
        if (result1 != null) {
            System.out.println("Intersection at node with value: " + result1.getVal());
        } else {
            System.out.println("No intersection.");
        }
    }
}
