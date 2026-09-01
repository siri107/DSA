/* public Definition
HashSet stores unique elements.
Duplicates are automatically ignored.
Elements are not stored in a guaranteed order.
Allows at most one null value.
Useful for checking duplicates, uniqueness, and membership.
Import
import java.util.HashSet;
Creation
HashSet<Integer> set = new HashSet<>();
Important Methods
Method	Purpose	Example
add()	Add element	set.add(10);
contains()	Check element	set.contains(10);
remove()	Remove element	set.remove(10);
size()	Number of unique elements	set.size();
isEmpty()	Check empty	set.isEmpty();
clear()	Remove all elements	set.clear();
add()
set.add(10);
set.add(20);
set.add(10);

Result:

[10, 20]

The second 10 is ignored.

contains()
set.contains(20);

Returns:

true

if the element exists.

remove()
set.remove(20);

Removes 20 from the set.

size()
set.size();

Returns the number of unique elements.

Example:

[10, 20, 10, 30]

Size = 3

isEmpty()
set.isEmpty();

Returns true if there are no elements.

clear()
set.clear();

Removes all elements.

Check Duplicate in Array ⭐
HashSet<Integer> set = new HashSet<>();

boolean duplicate = false;

for(int x : arr) {
    if(set.contains(x)) {
        duplicate = true;
        break;
    }
    set.add(x);
}
Example
arr = [1, 2, 3, 2, 4]

When the second 2 is found:

duplicate = true
Shorter approach
HashSet<Integer> set = new HashSet<>();

for(int x : arr) {
    if(!set.add(x)) {
        System.out.println("Duplicate found");
        break;
    }
}

Why?

add() returns:

true → element was newly added
false → element already exists
Number of Unique Elements
HashSet<Integer> set = new HashSet<>();

for(int x : arr) {
    set.add(x);
}

System.out.println(set.size());

Example:

arr = [1, 2, 2, 3, 4, 4]

Unique elements = 4
Intersection of Two Arrays ⭐

Intersection means elements that are present in both arrays.

int[] arr1 = {1, 2, 3, 4};
int[] arr2 = {3, 4, 5, 6};

HashSet<Integer> set = new HashSet<>();

for(int x : arr1) {
    set.add(x);
}

HashSet<Integer> intersection = new HashSet<>();

for(int x : arr2) {
    if(set.contains(x)) {
        intersection.add(x);
    }
}

System.out.println(intersection);

Output:

[3, 4]

Using another HashSet ensures duplicate intersection values are stored only once.

Complete Practice Program*/

import java.util.HashSet;

public class Hashsets {

    public static void main(String[] args) {

        // Create HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add numbers including duplicates
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(10);

        System.out.println("Set: " + set);

        // Check whether a number exists
        System.out.println("Contains 20? " + set.contains(20));

        // Remove a number
        set.remove(30);
        System.out.println("After removing 30: " + set);

        // Number of unique elements
        System.out.println("Unique elements: " + set.size());

        // Check empty
        System.out.println("Is empty? " + set.isEmpty());

        // Array for duplicate checking
        int[] arr = {1, 2, 3, 2, 4};

        HashSet<Integer> numbers = new HashSet<>();

        boolean duplicate = false;

        for(int x : arr) {
            if(!numbers.add(x)) {
                duplicate = true;
                break;
            }
        }

        System.out.println("Contains duplicates? " + duplicate);

        // Intersection of two arrays
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        HashSet<Integer> first = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int x : arr1) {
            first.add(x);
        }

        for(int x : arr2) {
            if(first.contains(x)) {
                intersection.add(x);
            }
        }

        System.out.println("Intersection: " + intersection);

        // Clear set
        set.clear();

        System.out.println("After clear: " + set);
        System.out.println("Is empty? " + set.isEmpty());
    }
} 
