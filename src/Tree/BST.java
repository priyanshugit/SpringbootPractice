package Tree;

class Node{
    int data;
    Node left;
    Node right;
}
public class BST {
    public static Node creatNewNode(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }
    public static Node insert(Node node, int value){
        if(node == null)
            return creatNewNode(value);
        if(value <node.data)
            node.left = insert(node.left, value);
        else if (value> node.data) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public static void preOrderTraversal(Node node){
        if(node == null)
            return;
        System.out.print(node.data +" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void inOrderTraversal(Node node){
        if(node == null)
            return;
        inOrderTraversal(node.left);
        System.out.print(node.data+" ");
        inOrderTraversal(node.right);
    }
    public static void postOrderTraversal(Node node){
        if(node == null)
            return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data +" ");

    }
    public static boolean searchNode(Node node, int value){
        if(node == null || node.data ==value) {
            return node !=null;
        }
        if(value <node.data)
           return searchNode(node.left, value);
        return searchNode(node.right, value);

    }
    public static void main(String[] args) {
        Node root = null;
        root =  insert(root, 4);
        root =  insert(root, 2);
        root =  insert(root, 5);
        root =  insert(root, 1);
        root =  insert(root, 3);
        System.out.println("PreOrder Traversal");
        preOrderTraversal(root);
        System.out.println("\nInOrder Traversal");
        inOrderTraversal(root);
        System.out.println("\nPostOrder Traversal");
        postOrderTraversal(root);
        System.out.println( searchNode(root,9 ));

    }

}
