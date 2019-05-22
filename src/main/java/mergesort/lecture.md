# Lecture Notes: Merge Sort 

A merge sort divides a collection into two sub collections and calls itself recursively until each sub collection only has 
one element. Then a merge function is called to put the single elements back together in order. Each sub collection is thusly 
merged until the collection is all back together - in sorted order. 

## Learning Objectives 
    1. "Divide and Conquer" algorithms 
    2. Describe the parts and functions of a merge sort 
    3. Following the algorithim and pseudo provided, impliment a merge sort
    4. Practice with assesing big O complexity

## Lecture Flow 

- have Diagram 1 on the projector as class starts and students come in/sit down. Leave up for as long as is practical.

### Divide and Conquer Algorithms 

- Definition: 
    - Divide: Break the problem down into pieces your equipped to solve
    - Conquer: Solve these pieces using recursion 
    - Combine: Combine the solved bits back into a larger solved whole 
- Approach is seen in a variety of contexts (Can students think of any other contexts they would use this type of approach?)
    - Binary Search
    - Closest Pair of Points 
    - and.... Merge Sort 

### Merge Sort 

- Basics: 
    - Divide: break your collection down smaller and smaller until each collection is just one element large
    - Conquer: do this recursively, and recursively... 
    - Combine: call the merge function to put them back together in order 
- Show Diagram 2, pause at 0:55 to demonstrate how it is in fact divided into large collections about to be recombined 
into the whole.  
- Jump to the Algorithm Section, and pull out the white board. Follow in line notes as you go through and collaboratively 
construct it on the board for the class. 

- Complexity 
    - start off by asking the class if they can asses the complexity - strongly prefer answers from them to just providing it. 
    - Time: 0(logN) - due to recursion 
    - Space: 0(N) - due to external storage to facilitate the sort

## Diagram 
[Diagram 1](https://idea-instructions.com/merge-sort/:)
- Ikeaesque instructions from IDEA, a project by Sándor P. Fekete and Sebastian Morr
[Diagram 2](https://www.youtube.com/watch?v=ZRPoEKHXTJg) 
 - audio-visualization of a merge sort by youtuber Timo Bingmann 

## Algorithm 

1. Input: 
    - Arr - Our Sort needs to take into a collection, for ease this should be an Array. 
        - However, if the students feel strongly else wise run with it. (As with the Insertion sort lecture in this series, 
        the goal is for them to feel ownership over this process just as much it is providing an accurate Algorithm. Both are vital.) 
    - first - Index of 1st Element in the collection
    - last - Index of Last Element in the collection 
3. Find the Mid Point 
    - mid = (first+last)/2 
2. Recursion: 
    - Call two different instances of MergeSort: 
        - first half: MergeSort(arr, first, mid)
        - second half: MergeSort(arr, mid+1, last)
3. Merge 
    - Write the merge function separately to be called within merge sort 
    1. Input: 
        - Arr 
        - first 
        - mid
        - last 
    2. Create a new list to merge into (language/collection specific step) 
    3. Compare the first element of each collection to be merged, place the smaller first. 
        - traverse through the rest of the collection following the same procedure
    4. when finished with 2 initial collections, return sorted collection 

        

## Pseudocode 

 Sort 
 
    Sort(Arr, first, last) - no return 

    // find the mid point 
    mid = (first+last)/2 

    //Recursion 
    Sort(Arr, first, mid)
    Sort(Arr, mid+1, last)
    
    //Merge
    
    Merge(Arr, first, mid, last)


Merge 

    Merge(Arr, first, mid, last) - no return 
    
    //create a holding array for the merge, one larger than the size of the two arrays to be combined 
    holdingArray [last-first +1] 
    
    //create variables to hold the index we are at in each array
    
    i = first;  //array 1
    j = mid+1;  //array 2
    k = 0;      //holdingArray
    
    while i is smaller than mid and j is smaller than last 
        if i is less than or equal to j 
            set the value of k as the value of i 
            incriment i and k 
        else 
            set the value of k as the value of j 
            incrument j and k 
    
    //these line are in place incase array 1 and array 2 are mismatched in size 
        
    while i is smaller than mid 
        the value of k is equal to the value of i 
        incriment i and k 
        
    while j is smaller than last 
        the value of k is equal to the value of j 
        incriment j and k 
    
    //finally copy the holding array back over to the original array 
    
    for loop i equals first, less than end, incriment 
        Arr at index i = holding array at index of (i - first)
        

## Readings and References 

### Watch 
https://www.youtube.com/watch?v=JSceec-wEyw 

### Read 
https://www.geeksforgeeks.org/divide-and-conquer-algorithm-introduction/
https://www.geeksforgeeks.org/merge-sort/
https://www.interviewbit.com/tutorial/merge-sort-algorithm/

### Bookmark 
https://idea-instructions.com/merge-sort/ 