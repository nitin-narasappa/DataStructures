
/**
* For a given Node as below, the Inorder, Preorder and Postorder traversal logic is mentioned below.
*/
class Node {
    int data;
    Node left;
    Node right;
}
/** Inorder
*/
void Inorder(Node root) {
   if(root.left != null){
       Inorder(root.left);
   }
    System.out.print(root.data + " ");
    if(root.right != null) {
        Inorder(root.right);
    }
}

/** Preorder
*/
void Preorder(Node root) {
    System.out.print(root.data + " ");
    if(root.left != null) {
        Preorder(root.left);
    }
    if(root.right != null) {
        Preorder(root.right);
    }
}
/** Postorder 
*/
void Postorder(Node root) {
    if(root.left != null){
        Postorder(root.left);
    }
    if(root.right != null) {
        Postorder(root.right);
    }
    System.out.print(root.data+ " ");
}



