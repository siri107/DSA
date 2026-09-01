/*
A Priority Queue is a data structure where elements are removed based on their priority, not simply according to insertion order.
In Java, PriorityQueue is implemented using a Heap.
import java.util.PriorityQueue;
1. Creating a PriorityQueue
Min-Heap — Default
PriorityQueue<Integer> pq = new PriorityQueue<>();
The smallest element always has the highest priority.

Example:
pq.add(30);
pq.add(10);
pq.add(20);

Conceptually:

10 ← highest priority
20
30
System.out.println(pq.peek());

Output:
10
======================================================================
2. Important Functions
Function	        Purpose
add()	        Add element
offer()	        Add element
peek()	        View highest-priority element
poll()	        Remove and return highest-priority element
remove()	    Remove element
size()	        Number of elements
isEmpty()	    Check if empty
clear()	        Remove all elements
contains()	    Check element
=======================================================================
3. add()
Adds an element.
pq.add(40);
pq.add(10);
pq.add(30);
The smallest element gets the highest priority.
========================================================================
4. offer()
Adds an element.
pq.offer(40);
pq.offer(10);
pq.offer(30);
The smallest element gets the highest priority.
========================================================================
4. peek()
Returns the highest-priority element without removing it.
System.out.println(pq.peek());
Example:
PQ = [10, 30, 40]
peek() → 10
PQ = [10, 30, 40]   ← unchanged
========================================================================
5. poll() ⭐
Removes and returns the highest-priority element.
System.out.println(pq.poll());
Example:
Before:
[10, 30, 40]
poll() → 10
After:
[30, 40]
Difference
peek() → see the element
poll() → remove the element
========================================================================
6. PriorityQueue Example
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

        System.out.println("Top: " + pq.peek());

        System.out.println("Removed: " + pq.poll());
        System.out.println("Top: " + pq.peek());

        System.out.println("Size: " + pq.size());
    }
}

Output:

Top: 10
Removed: 10
Top: 20
Size: 3
========================================================================
7. How to Traverse / Print in Priority Order

⚠️ Don't assume:

System.out.println(pq);
will print elements in sorted order.
To process them according to priority:
while(!pq.isEmpty()) {
    System.out.println(pq.poll());
}
Output:
10
20
30
50
Because every time we poll(), the smallest element is removed.
========================================================================
8. Max-Heap

By default:

PriorityQueue<Integer> pq = new PriorityQueue<>();

is a Min-Heap.

For a Max-Heap:

PriorityQueue<Integer> pq =
    new PriorityQueue<>(Collections.reverseOrder());

Need:

import java.util.Collections;

Example:

PriorityQueue<Integer> pq =
    new PriorityQueue<>(Collections.reverseOrder());

pq.add(30);
pq.add(10);
pq.add(50);
pq.add(20);

System.out.println(pq.peek());

Output:

50

Now the largest element has the highest priority.


Min-Heap:
10 ← peek
20
30
40

Max-Heap:
40 ← peek
30
20
10

11. PriorityQueue Complexity
Operation	Complexity
add()	    O(log n)
offer()	    O(log n)
peek()	    O(1)
poll()	    O(log n)
remove()	O(log n)
contains()	O(n)
size()	    O(1)*/

import java.util.PriorityQueue;

public class Priority_Q {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

        System.out.println("Top: " + pq.peek());

        System.out.println("Removed: " + pq.poll());
        System.out.println("Top: " + pq.peek());

        System.out.println("Size: " + pq.size());
    }
}
