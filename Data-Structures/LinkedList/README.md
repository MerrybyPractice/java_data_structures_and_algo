# Singly Linked List
A singly linked list is a data structure in which each node has two parts - a value and a reference. They are a bit like 
Array's, except that they use non-sequential memory - instead relying on the reference to find the next node in the list.
  

## Challenge

The goal of this challenge was to create a app that will allow for the creation, addition to, navigation,
 and viewing of a singly linked list. 


## Approach and Efficiency
I opted to keep this as simple as I could, and created two different classes - one for the list its self and one for 
creating the nodes. Apart from a very few exceptions to be discussed shortly, most everything relies on dot notation and 
should be O(1). Two of the method's, includes and print, use while loops which are incrementing over a single node at a 
time. I believe that these should be O(n) - as at the worst case they will need to go through the entire list. 


 ## API 
 
 ### LinkedList()
    When this method is called, an empty linked list is created. When a new node is added to this list, 
    it will automatically have a refrence value of null.
    
 ### insert(value)
    LinkedList.insert(value)
    By passing a value into Insert, a user can create a new node in the linked list that will have a value equal to that
    value. This node will become the new head node in the list. The Node Constructor class attached to this method is
    set up so that it will be able to handle any type of value passed into it. Refer to the test suite
    for examples of it handling Objects and primitives. 
    
 ### includes(value) 
    LinkedList.includes(value)
    A user can pass a sinble value into the includes method and recieve a boolean, 
    true if the value is in the list, false if it is not. 
    
 ### print
    LinkedList.print 
    By calling the print method on an exsisiting list, a user can view the values of said list in the Terminal. 
    Additionally, an ArrayList of the LinkedList will be returned to the spot the user called from. 
    
 ### head 
    LinkedList.head
    A user can access the current head using this property. 
 
 ### value 
    LinkedList.head.value 
    A user can access the value of a given node using this property. 
 
 ### reference 
    LinkedList.head.refrence 
    A user can access the refrence of a given node using this property. 
    By chaining it, one can traverse cross nodes to target specific values or refrences relative to the head. 
    LinkedList.head.refrence.refrence.value 
    LinkedList.head.refrence.revrence.refrence 
   
    
    
    
    
  