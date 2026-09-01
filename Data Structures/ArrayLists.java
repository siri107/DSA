/* Definition
ArrayList is a resizable/dynamic array in Java.
Size can increase or decrease dynamically.
It stores objects, so for integers use Integer.

Import
import java.util.ArrayList;

Creation
ArrayList<Integer> list = new ArrayList<>();

Important Methods
Method	              Purpose	            Example
add()	        Add element	            list.add(10);
get()	        Access element	        list.get(0);
set()	        Update element	        list.set(0, 20);
remove()	    Remove element	        list.remove(0);
contains()	    Check value	            list.contains(20);
size()	        Number of elements	    list.size();
isEmpty()	    Check if empty	        list.isEmpty();
clear()	        Remove all elements	    list.clear();
indexOf()	    Find index	            list.indexOf(20); */
import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add five numbers
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);

        // Update element using set()
        list.set(2, 100);

        System.out.println("After update: " + list);

        // Remove element by index
        list.remove(1);

        System.out.println("After removing index 1: " + list);

        // Check whether a value exists
        if(list.contains(40)) {
            System.out.println("40 exists");
        } else {
            System.out.println("40 does not exist");
        }

        // Find index of a value
        int index = list.indexOf(40);

        System.out.println("Index of 40: " + index);

        // Print all elements
        System.out.println("Elements:");

        for(int x : list) {
            System.out.println(x);
        }

        // Size
        System.out.println("Size: " + list.size());

        // Clear list
        list.clear();

        System.out.println("After clear: " + list);

        // Check isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());
    }
}