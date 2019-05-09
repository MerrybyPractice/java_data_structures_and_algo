# Trees
<!-- Short summary or background information -->

## Challenge
This lab required three different classes, a Binary Tree class, a Binary Search Tree class, and a Node class. 
- The Binary Tree class needed to implement the three depth first traversals, preOrder, inOrder, and postOrder. 
- The Binary Search Tree class needed to implement methods for adding a node, and checking to see if a value was stored 
    in the tree. 
- The Node class needed to house the properties for the Value of each node, as well as the Right Child and the Left Child. 

Additionally, the tests had to cover and pass the following parameters: 

-  Successful instantiation of an empty tree.    
- Successful instantiation of a tree with a single root node. 
- Additions of left and right children onto a root node. 
- Returns the correct collections from each of the depth traversal methods. 

## Approach & Efficiency

I opted to house my three classes in a single package so that I would be able to access various methods cross class. 
Binary Search Tree extends Binary Tree so that I did not need to repeat properties between the two. 

For my traversals, I opted for a recursive method that bottoms out at the leaves - making use of the stack as it goes. 
For my add functionality, I implemented a while loop which should have O(n) time efficiency. 
My Contains method works much the same way, and should also be O(n). 


## API

### NodeConstructor Class 
    
#### Properties 

- Public Int Value - passed into the constructor 
- Protected NodeConstructor leftChild - instantiated as null 
- Protected NodeConstructor rightChild - instantiated as null

#### Methods 

- Public NodeConstructor(int Value) - takes the user passed int value and sets it as the value of the created node. 

 

### Binary Tree Class 

#### Properties 

- Public NodeConstructor root - instantiated as null. 
- Public NodeConstructor current. 

#### Methods 

- preOrderTraversal - takes in a NodeConstructor current and an empty ArrayList preOrderArray, uses this information to 
recursively traverse the tree utilizing preordered principals, and returns an ArrayList of the values of each node. 

- inOrderTraversal - takes in a NodeConstructor current and an empty ArrayList inOrderArray, uses this information to 
  recursively traverse the tree utilizing inordered principals, and returns an ArrayList of the values of each node.
  
- postOrderTraversal - takes in a NodeConstructor current and an empty ArrayList postOrderArray, uses this information to 
  recursively traverse the tree utilizing posteordered principals, and returns an ArrayList of the values of each node.
 
### Binary Search Tree

Extends BinaryTree, and so has access to the properties and methods of that class. 

#### Unique Methods 

- BinarySearchTree constructor - takes in an Integer value and creates a new Binary Search Tree with a root of that value. 

- Add - takes in an Int value and adds it to an existing tree in the correct place for a Binary Search Tree. This tree 
can have a existing root or not. 

- Contains - takes in an int value and returns a boolean of if that value is contained in the tree or not. 

