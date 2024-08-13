//package treeTraversal;
class Node{
    char key;
    Node left,right;
    Node(char key){
        this.key=key;
    }
}
class treeTraversal{
Node root;
void preordertraversal(Node n){
if(n!=null){
    System.out.println(n.key);
    preordertraversal(n.left);
    preordertraversal(n.right);
}
}
void postordertraversal(Node n){
    if(n!=null){
        
        preordertraversal(n.left);
        preordertraversal(n.right);
        System.out.println(n.key);
    }
    }
    void inordertraversal(Node n){
        if(n!=null){
           
            preordertraversal(n.left);
            System.out.println(n.key);
            preordertraversal(n.right);
        }
        }
}
class Traversal{
    public static void main(String[] args) {
        treeTraversal t1 = new treeTraversal();
        t1.root=new Node('A');
        t1.root.left=new Node('B');
        t1.root.right=new Node('c');
        t1.root.left.left=new Node('D');
        t1.root.left.right=new Node('E');
        System.out.println("preorder");
        t1.preordertraversal(t1.root);
        System.out.println("postorder");
        t1.postordertraversal(t1.root);
        System.out.println("inorder");
        t1.inordertraversal(t1.root);
    }
}
