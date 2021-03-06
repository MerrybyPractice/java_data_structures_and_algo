# hashpackage

I find hashing and other cryptography concepts fascinating, so when starting my code challenge on the topic during Java 
401 I wanted to set up my package to be scalable and encourage further experimentation. Some of these will be repeated from
the general challenges ReadMe, however any that are personal experimentation and were not assigned will be unique to this 
document. Below is a list of the current files and their features: 

## Hashes

### [BasicHash](./src/main/java/hash/BasicHash.java) 
    A straight forward hashing algorithm. It recieves a String value, multiplies the ASCII values of each CHAR, and finally
    multiplies the whole thing by 599. 
### [StringIndexHash](./src/main/java/hash/StringIndexHash.java)
    Recieves a String value, multiplies the ASCII value by its position in the string before multiplying the ASCII values 
    by each other, finishes off by multiplying the whole thing by 599. 
### [LinguisticHash](./src/main/java/hash/LinguisticHash.java)
    This one was just a fun idea I had. It takes in a String value, passes it to the google translate API and requests a 
    translation to German, recieves the translated key, and then performs the StringHash on it. I would like to experiment 
    with this further. If you are pulling and runnint this on your own machine, you will need to set up your google 
    translate key via google cloud services as per the instructions in their documentation. 

## Data Structures Using Hashes 

### [HashTable](./src/main/java/hash/Hashtable.java)
 
 A basic Hash Table using the BasicHash and HashLinkedList. 
 
Methods
---
 
 | Name | Input | Output | Process | 
 |:----:|:-----:|:------:|:----------------------:|
 |findIndex|String| int | Accesses the BasicHash, modulo's the return against the length of the hash table, returns the absolute value | 
 | add | String Key and String Value | void | calls findIndex on the key, sets the key and the value as a KeyValuePair, sets the keyValuePair to the calculated index | 
 | get | String | KeyValuePair | calls findIndex on the input String, checks if the Key is in the hash table at that index, if it is found returns the whole KeyValuePair, if it is not returns a KeyValuePair with key: key not found value: please try again with a different key |
 | contains | String | boolean | calls findIndex on the input string, traverses the list checking if the key is present, if found sets boolean to true, if not sets boolean to false | 
     
## Support Classes 

### [HashLinkedList](./src/main/java/hash/LinkedList.java)
  A stripped down linked list calss that specifically stores Key Value pairs and contains only the methods necessary 
  for a Hash Table. 
 
