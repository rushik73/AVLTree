Name: Rushik Guduru
NetID: rxg200049

The source code I have written is an implementation of an AVL Tree using the AVLNode class given by Professor Belkoura. This AVLNode class contains the 4 methods for self balancing the AVL Tree.

They are for rotating right, rotating left, rotating right left and rotating left right. The functionalities for AVL Tree were for Insertion and Balancing. You would have to call the .balanceTree() method to balance the Binary Tree.

Files used:

AVLNode.java - Contains the implementation of the AVL tree, including insertion and balance operations.

AVLTest.java - Main method that reads test cases (sequences of operations) and executes them.

The output of the AVL Tree for First tree:

       15
       /  \
      7   25
     / \  / \
    4  8 20 27
   /     /
  2     5


The output of the AVL Tree for Second tree:

         20
        /  \
      16    27
     / \    / \
    15 19  28 29
   /
  4

The inOrderTraversal() method prints the AVL Tree as a list.

The output of list of the balanced FirstTree: 2 4 5 7 8 15 20 25 27

The output of list of the balanced SecondTree: 4 15 16 19 20 27 28 29