// This is a Java implementation of the "Copy List with Random Pointer" problem (LeetCode 138). The code defines a linked list node class with a value, a next pointer, and a random pointer. The `copyRandomList` method creates a deep copy of the linked list, preserving the structure and random pointers. The main method demonstrates how to create a sample linked list, copy it, and print the copied list to verify correctness.
// lc link : https://leetcode.com/problems/copy-list-with-random-pointer/description/
import java.util.HashMap;
public class Copy_List_with_Random_Pointer_138 {
    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // Step 1: Create a mapping of original nodes to their copies
        HashMap<Node, Node> map = new HashMap<>();
        Node current = head;
        while (current != null) {
            map.put(current, new Node(current.val));
            current = current.next;
        }

        // Step 2: Set the next and random pointers for the copied nodes
        current = head;
        while (current != null) {
            Node copyNode = map.get(current);
            copyNode.next = map.get(current.next);
            copyNode.random = map.get(current.random);
            current = current.next;
        }

        // Return the head of the copied list
        return map.get(head);
    }
    // time : O(n)
    // space : O(n)
    public static void main(String[] args) {
        Copy_List_with_Random_Pointer_138 solution = new Copy_List_with_Random_Pointer_138();

        // Create a sample linked list with random pointers
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

        node1.random = node3; // 1's random points to 3
        node2.random = node1; // 2's random points to 1
        node3.random = null;  // 3's random is null

        // Copy the linked list
        Node copiedHead = solution.copyRandomList(node1);

        // Print the copied linked list to verify
        Node current = copiedHead;
        while (current != null) {
            System.out.print("Node val: " + current.val);
            if (current.random != null) {
                System.out.print(", Random points to: " + current.random.val);
            } else {
                System.out.print(", Random points to: null");
            }
            System.out.println();
            current = current.next;
        }
    }
}
