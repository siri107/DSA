/* 
=================================================================
1. What is an Array?
An array is a data structure used to store multiple values of the same data type in a single variable.

Array elements are stored using index positions.
Index starts from 0.
Size of an array is fixed after creation.
In Java, arrays are objects.

Example:

int[] arr = {10, 20, 30, 40, 50};
Index	0	1	2	3	4
Value	10	20	30	40	50
================================================================
2. Array Declaration
There are two common ways:
int[] arr;
or
int arr[];
Recommended:
int[] arr;
At this point, the array is only declared, not created.
=================================================================
3. Array Creation

Use the new keyword:

int[] arr = new int[5];

This creates an integer array containing 5 elements.

Default values:

[0, 0, 0, 0, 0]
=================================================================
For different data types:

Type	     Default value
int	            0
double	        0.0
boolean	        false
char	        '\u0000'
Object/String	null
==================================================================
4. Array Initialization
Method 1: Initialize while creating
int[] arr = {10, 20, 30, 40, 50};
Method 2: Create first, assign later
int[] arr = new int[5];

arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;
===================================================================
5. Array Indexing

Array indexing starts from 0.

int[] arr = {10, 20, 30, 40};
System.out.println(arr[0]);  // 10
System.out.println(arr[2]);  // 30

Last element:
arr[arr.length]

⚠️ This is invalid:
arr[4]
because the valid indexes are 0 to 3.
It causes:
ArrayIndexOutOfBoundsException
====================================================================
6. Updating an Array Element

Simply assign a new value using its index.

int[] arr = {10, 20, 30};

arr[1] = 50;

Now:

[10, 50, 30]

Time Complexity: O(1)

Because we directly access the index.
=====================================================================

7. Finding Array Length
Use:
arr.length
Example:
int[] arr = {10, 20, 30, 40};
System.out.println(arr.length);
Output:
4
⚠️ For arrays, use:
arr.length
not:
arr.length()
=====================================================================
8. Traversing an Array
Traversal means visiting every element of the array.
Using for loop
int[] arr = {10, 20, 30, 40};
for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
Output:

10
20
30
40
Enhanced for loop
for(int x : arr) {
    System.out.println(x);
}

Use a normal for loop when you need the index or want to modify elements.
=====================================================================
9. Find Maximum Element
int max = arr[0];

for(int i = 1; i < arr.length; i++) {
    if(arr[i] > max) {
        max = arr[i];
    }
}

System.out.println(max);

Example:

arr = [10, 25, 7, 40, 15]

Maximum = 40

Time: O(n)
Space: O(1)
=====================================================================
10. Find Minimum Element
int min = arr[0];

for(int i = 1; i < arr.length; i++) {
    if(arr[i] < min) {
        min = arr[i];
    }
}

System.out.println(min);

Time: O(n)
Space: O(1)
=====================================================================
11. Calculate Sum
int sum = 0;

for(int i = 0; i < arr.length; i++) {
    sum += arr[i];
}

System.out.println(sum);

Example:

[10, 20, 30]

sum = 60

Time: O(n)
Space: O(1)
=====================================================================
12. Count Even Numbers
int count = 0;
for(int i = 0; i < arr.length; i++) {
    if(arr[i] % 2 == 0) {
        count++;
    }
}
System.out.println(count);
Example:
[10, 15, 20, 7, 8]
Even numbers = 10, 20, 8
Count = 3
Time: O(n)
Space: O(1)
=====================================================================
13. Reverse an Array
The easiest method is using two pointers.
int left = 0;
int right = arr.length - 1;
while(left < right) {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

    left++;
    right--;
}
Example:
Before: [10, 20, 30, 40, 50]
After:  [50, 40, 30, 20, 10]
Why left < right?
We swap:
first ↔ last
second ↔ second-last
...

When they meet, the array is completely reversed.
Time: O(n)
Extra Space: O(1)
=====================================================================
14. Search for a Target — Linear Search
Linear search checks elements one by one.
int target = 30;
int index = -1;
for(int i = 0; i < arr.length; i++) {
    if(arr[i] == target) {
        index = i;
        break;
    }
}
System.out.println(index);
If:
arr = [10, 20, 30, 40]
target = 30
Output:
2
If the element doesn't exist:
-1
Best case: O(1)
Worst case: O(n)
Average case: O(n)
=====================================================================
15. Copy an Array
Method 1: Using loop
int[] arr = {10, 20, 30, 40};

int[] copy = new int[arr.length];

for(int i = 0; i < arr.length; i++) {
    copy[i] = arr[i];
}

Now:

arr  = [10, 20, 30, 40]
copy = [10, 20, 30, 40]
Method 2: Arrays.copyOf()
import java.util.Arrays;

int[] copy = Arrays.copyOf(arr, arr.length);

This is generally the cleaner approach.
======================================================================
16. Arrays Class — Useful Methods

Java provides the Arrays class:
import java.util.Arrays;

Print array
System.out.println(Arrays.toString(arr));

Sort
Arrays.sort(arr);

Copy
int[] copy = Arrays.copyOf(arr, arr.length);

Fill
Arrays.fill(arr, 5);

All elements become 5.
=======================================================================
17. Returning an Array from a Method
A method can return an entire array.

static int[] createArray() {
    int[] arr = {10, 20, 30};
    return arr;
}

Calling:
int[] result = createArray();
System.out.println(Arrays.toString(result));
Output:
[10, 20, 30]
The return type is:
int[]
not just int.
========================================================================

18. Complete Practice Program  */
import java.util.Arrays;

public class Array {

    static int findMax(int[] arr) {
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    static int findSum(int[] arr) {
        int sum = 0;

        for(int x : arr) {
            sum += x;
        }

        return sum;
    }

    static int countEven(int[] arr) {
        int count = 0;

        for(int x : arr) {
            if(x % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    static int search(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 7, 40};

        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("Maximum: " + findMax(arr));
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Sum: " + findSum(arr));
        System.out.println("Even Count: " + countEven(arr));

        System.out.println("Target 30 found at index: "
                           + search(arr, 30));

        reverse(arr);

        System.out.println("Reversed: " + Arrays.toString(arr));
    }
}