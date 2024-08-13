class Node{
    char key;
    Node left,right;
    Node(char key){
        this.key=key;
    }
}
class binerysearch{
    Node root;
    void inserkey(char key){
    root=inserintree(root, key);
    }
    Node inserintree(Node root,char key){
        if(root==null){
            root =new Node(key);
            return root;
        }
       if(key<root.key){
        root.left=inserintree(root.left,key);
       }
       else if(key>root.key){
        root.right=inserintree(root.right, key);
       }
       return root;  
    }
    void preordertraversal(Node root){
        if(root!=null){
            System.out.println(root.key+"");
            preordertraversal(root.left);
            preordertraversal(root.right);
        }
    }
}
public class example{
 public static void main(String[] args) {
    binerysearch t1=new binerysearch();
       t1.inserkey('c');
        t1.inserkey('i');
        t1.inserkey('b');
        t1.inserkey('g');
        t1.inserkey('m');
        t1.inserkey('a');
        t1.preordertraversal(t1.root);
 }   
}