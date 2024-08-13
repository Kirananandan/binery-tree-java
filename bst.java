class Node{
    char key;
    Node left,right;
    Node(char key){
    this.key=key;
}
}
class binerysolution{
    Node root;
    void insertkey(char key){
    root = insertInTree(root, key);
    }
    Node insertInTree(Node root,char key){
    if(root ==null){
        root=new Node(key);
        return root;
    
    }
    if (key<root.key){
        root.left=insertInTree(root.left,key);


    }else if (key>root.key) {
        root.right=insertInTree(root.right,key);
    }
    return root;
}
    void preordertraversal(Node root){
        if(root !=null);{
        System.out.println(root.key+"");
        preordertraversal(root.left);
        preordertraversal(root.right);
    }
}
}
public class bst{
    public static void main(String[] args) {
        binerysolution t1=new binerysolution();
        t1.insertkey('c');
        t1.insertkey('i');
        t1.insertkey('b');
        t1.insertkey('g');
        t1.insertkey('m');
        t1.insertkey('a');
        t1.preordertraversal(t1.root);
    }
}