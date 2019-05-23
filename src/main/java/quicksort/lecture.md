# Lecture Notes: Quick Sort 

## Learning Objectives 

    1. Identify the differences and similarities between a quick and merge sort
    2. Identify and discuss the parts of a quick sort 
    3. Be knowlagable of the different types of quick sort
    
## Lecture Flow 

### Divide and Conquer Algorithm 
 -like the Merge Sort, a Quick Sort is a divide and conquer algorithm. 
 - This means it has what three pieces? (pose this to class, record answers on board) 
    1. Divide: Break down the problem to smallest solvable bit
    2. Conquer: Solve recursively 
    3. Combine: Put the solved bits back together into larger solved bits till they are all together and solved

### Parts of a QuickSort 

- Pivot: The selected element in the array around which the rest of the sort will take place. When a QuickSort is finished, 
        the elements on the left side of the pivot will all be smaller than it while the items on the right side will be 
        larger.  
        
    - left side: Elements smaller than the Pivot 
    - right side: Elements larger than the Pivot 
- Pointers: 
    - left: on the first element 
    - right on the last element 
     
- Partition: the process by which collection elements get shuffled to their correct sides of the Pivot

Show Diagram 1 here, be sure to take time and point out the pivot and how it changes each time the recursive function 
is called. When you have it pulled up, be sure to drop down and show the top comment by Jeremy Friesner (If it no longer 
exists, see Diagram 1.2). The only proper way to give this lecture is to then sing that to the class in the tune of 
the sound of silence. However, other options are acceptable if that is too much for your classroom. 

While introducing the Algorithm section next, be sure to mention that many sources discuss picking a first or last element 
as your Pivot. However, in this algorithm and in the pseudo provided we will be selecting the median as a preventative 
measure against poor O(n).

## Diagram 

[Diagram 1.1](https://www.youtube.com/watch?v=8hEyhs3OV1w)
- Youtube audio-visualization from Timo Bingmann 

    Diagram 1.2
    
            Jeremy Friesner
            1 year ago
            ---
            Hello quicksort my old friend
            You always run in N*(log N) 
            Because recursion splits the input set
            Into pieces small enough to vet
            And the ordering of items that were equal in their range
            Still remains
            After each round of sorting


## Algorithm 

Input: Collection, first index, last index 
Output: Collection (sorted)

1. Find the median (or closest whole number) between the first and last index of the array and set it as the pivot. 
2. Set left pointer at index 0 and right pointer at index 0-1 
3. Check the value at each pointer, if said value is on the correct side of the pivot:
    - left pointer increments 
    - decrements pointer decrements 
4. When a pointer finds an element that it is out of place (greater than pivot on the left, less than on the right) it stops 
until the other pointer also finds an element that is out of place. 
5. When both pointers have found an element that is out of order, they swap them. 
6. Once both pointers are able to move through the array and intersect without swapping the array counts as sorted. 
7. This is called recursively, which manages all of the heavy lifting a loop or other control flow method might in this 
circumstance.
 
## Pseudocode 
  
### Quicksort 

### Partition 
Input: Arr, lIdx, rIdx 

Pivot <= (rIdx + lIdx)/2 

leftPointer <= lIdx 
rightPointer <= rIdx

for 
if the value of the index at leftPointer is <= Pivot 
    leftPointer ++ 
else 
    temp = value of leftPointer  

## Readings and References 

### Watch 

### Read 
[A Quick Explanation of Quick Sort by Karuna Sehgal on Medium](https://medium.com/karuna-sehgal/a-quick-explanation-of-quick-sort-7d8e2563629b)

### Bookmark 
[Kvick Sört part of the IDEA Project by Sándor P. Fekete and Sebastian Morr](https://idea-instructions.com/quick-sort/)