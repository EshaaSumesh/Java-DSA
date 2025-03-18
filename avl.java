import java.util.*;
class Node
{
    
    int value,height;
    Node left;
    Node right;
    
    Node(int value)
    {
        this.value=value;
        this.height=1;
        this.left=null;
        this.right=null;
    }
}

class AVL
{
    Node insert(Node node,int val) //return type -node , root 
    
    if(node==null)
    return new Node(val);
    
    else if(node.val>val)
    {
        node.left=insert(node.left,val);
    }
    
    else if(node.val<val)
    {
        node.right=insert(node.right,val);
    }
    
    else
    {
        return node;
    }
    
    int ht=getheight(node);
    int bal=getheight(node.left)-getheight(node.right)
}



public class Main
{
    public static void main(String[]args)
    {
        AVL t=new AVL();
        Node root=null;
        int [] values={20,30,25,47,67,90,33,89};
        for (int a:values)
        {
            root=insert(root,a);
        }
        t.inorder(t.root);
        t.preorder(t.root);
        t.postorder(t.root);
    }
}
