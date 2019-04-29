# Stacks and Queues

Building on the previous work with Linked Lists, the next Data Structures in this repository are Stacks and Queues. Both 
use the basic principals that makeup a linked list, but add their own unique requirements. 

## Challenge

For this challenge, I needed to create classes for a Stack, a Queue, and Nodes. These classes needed to create an empty 
version of their data structure, and then follow the proper conventions for adding and removing. They each have a peek 
method, and the conventional placeholders for top/front and rear as necessary.  

## Approach & Efficiency

I utilized constructors and if statements to manage unique cases - such as adding or removing from the null end of the 
structure. The Method's on each class should all be O1. 

## API

### Stack class 

#### Stack()
    Creates an empty stack, with the top set to null. 
    
#### push(Generic value)
    Adds a node to the top of the stack, and sets the passed in value as its value. Sets the refrence to null. 

#### peek()
    Returns the value of the top node. Does not alter the stack. 

### Queue class 

#### Queue()
    Creates a new empty Queue. Sets the front and the rear nodes equal to null. 
    
#### enqueue(Generic value)
    Takes in a generic value and adds a new node with that value to the rear end of the que. Sets this value as the rear 
    and its refrence to null. 
    
#### dequeue()
    Returns the value of the front node, sets the next node in the queue to the front. If the front.refrence is null, 
    returns the value of the front node and sets both the front and rear to null. 

#### peek()
    Returns the value of the front node. 

### NodeConstructor class  

#### Properties 

   -  public NodeConstructor reference; - the node to which the new node points. 
   -   public Generic value; - the generic value passed in to become the value of the new node. 
   
#### NodeConstructor(Generic Value, @Nullable NodeConstructor reference)
    Creates a new node with the value set to the passed in value. THe user can pass in a refrence, but 
    it is also nullable.  


    
