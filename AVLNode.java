
public class AVLNode {

    AVLNode() {

    }

    AVLNode(int element) {
        this.element = element;
        this.leftNode = null;
        this.rightNode = null;
        this.height = 1;
    }


    AVLNode(int element, AVLNode leftElement, AVLNode rightElement) {
        this.element = element;
        this.leftNode = leftElement;
        this.rightNode = rightElement;

    }

    //Element being -1 represents an undefined value
    int element = -1;
    AVLNode leftNode;
    AVLNode rightNode;
    int height;
    AVLNode root;


    public int getValue(){
        return element;
    }

    public int getHeight(AVLNode node){
        if(node == null){
            return 0;
        }

        return 1 + Math.max(leftNode.getHeight(node),rightNode.getHeight(node));

    }

    public void updateHeight(){

        height = 1 + Math.max(getHeight(leftNode),getHeight(rightNode));

    }


    public void insertNode(int value){
        AVLNode node = new AVLNode(value);
        if(root == null){
            root = node;
        }

        if(getValue() > value){
            if(leftNode == null){
                leftNode = new AVLNode(value);
            }else{
                leftNode.insertNode(value);
            }
        }else if(getValue() < value){
            if(rightNode == null){
                rightNode = new AVLNode(value);
            }else{
                rightNode.insertNode(value);
            }
        }
    }

    public void rotateRight(){
        AVLNode node = leftNode;
        leftNode = node.rightNode;
        node.rightNode = this;
        leftNode = node;
        updateHeight();
        node.updateHeight();
    }

    public void rotateLeft() {
        AVLNode node = rightNode;
        rightNode = node.leftNode;
        node.leftNode = this;
        rightNode = node;
        updateHeight();
        node.updateHeight();
    }

    public void leftRightRotate(){
        leftNode.rotateLeft();
        rotateRight();
    }

    public void rightLeftRotate() {
        rightNode.rotateRight();
        rotateLeft();
    }

    int checkBalance =  getHeight(this.leftNode) - getHeight(this.rightNode);

    public int getCheckBalance(AVLNode n){
        int check = getHeight(n.leftNode) - getHeight(n.rightNode);
        return check;
    }

    public void balanceTree(){
        //Left
        if(checkBalance < -1){
            if(getCheckBalance(leftNode) <= 0){
                leftNode.rotateRight();
            }else{
                leftNode.leftRightRotate();
            }
            //Right
        }else if(checkBalance > 1){
            if(getCheckBalance(rightNode) >= 0){
                rightNode.rotateLeft();
            }else{
                rightNode.rightLeftRotate();
            }
        }
    }

    public void inorderTraversal() {
        if (leftNode != null) {
            leftNode.inorderTraversal();
        }
        if(element != -1)
            System.out.print(element + " ");
        if (rightNode != null) {
            rightNode.inorderTraversal();
        }

    }
}
