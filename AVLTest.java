public class AVLTest {
    public static void main(String args[]){

        AVLNode FirstTree = new AVLNode();
        AVLNode SecondTree = new AVLNode();

        FirstTree.insertNode(27);
        FirstTree.insertNode(20);
        FirstTree.insertNode(25);
        FirstTree.insertNode(15);
        FirstTree.insertNode(8);
        FirstTree.insertNode(7);
        FirstTree.insertNode(4);
        FirstTree.insertNode(5);
        FirstTree.insertNode(2);

        SecondTree.insertNode(20);
        SecondTree.insertNode(19);
        SecondTree.insertNode(15);
        SecondTree.insertNode(16);
        SecondTree.insertNode(27);
        SecondTree.insertNode(29);
        SecondTree.insertNode(28);
        SecondTree.insertNode(4);

        //Call .balanceTree() method to balance the tree
        FirstTree.balanceTree();
        SecondTree.balanceTree();


        //Use in-order traversal to print out list implementation of the AVL Tree
        FirstTree.inorderTraversal();
        System.out.println();
        SecondTree.inorderTraversal();






    }
}
