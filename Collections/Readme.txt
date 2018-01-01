Java Collections Framework : Collections in java is a framework that provides an architecture to store and manipulate the group of objects.
The Collection interface (java.util.Collection) and Map interface (java.util.Map) are two main root interfaces of Java collection classes.

Java Collections Interfaces : Collection Interface, Iterator Interface, Set Interface, List Interface, Queue Interface, Dequeue Interface,                               Map Interface, ListIterator Interface, SortedSet Interface, SortedMap Interface.

Java Collections Classes : HashSet Class, TreeSet Class, ArrayList Class, LinkedList Class, HashMap Class, TreeMap Class, PriorityQueue Class

Collection : Root interface with basic methods like add(), remove(), 
             contains(), isEmpty(), addAll(), ... etc.

List : Can contain duplicates and elements are ordered. 
       Example implementations are LinkedList (linked list based) and ArrayList (dynamic array based).
 
Set   :  Doesn't allow duplicates. Example implementations of Set  interface are HashSet (Hashing based) and TreeSet (balanced BST based). 
         Note that TreeSet implements SortedSet.

Queue : Typically order elements in FIFO order except exceptions like PriorityQueue.  

Deque : Elements can be inserted and removed at both ends. 
        Allows both LIFO and FIFO. 

Map   : Contains Key value pairs. Doesn't allow duplicates.  
        Example implementation are HashMap and TreeMap. 
        TreeMap implements SortedMap.        

The difference between Set and Map interface is, in Set we have only keys, but in Map, we have key value pairs.
