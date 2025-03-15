class Node
{
    
    public int data; //to use in other class -public 
    public Node left;
    public Node right;
    
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class Tree
{
    public Node root=null;
    void insert(int data)
    {
        Node n=new Node(data);
        if(root==null)
        {
            root=n;
        }
        else
        {
                Node temp=root;
                while(true)
                {
                    if(temp.data>data) ///compares to current value
                    {
                        if(temp.left==null)
                        {
                            temp.left=n; //insert and then break 
                            break;
                        }
                        
                        else
                        {
                            temp=temp.left; //changes the temp value 
                        }
                    }
                    else
                    {
                        if(temp.right==null)
                        {
                            temp.right=n;
                            break;
                        }
                        else 
                        {
                            temp=temp.right;
                        }
                    }
                }
            }
        
    }
    
    void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+ "  ");
            inorder(root.right);
        }
    }
    
    void preorder(Node root)
    {
        if(root!=null)
        {
            preorder(root.right);
            System.out.print(root.data+ "  ");
            preorder(root.left);
        }
    }
    
    
}


public class Main{
    public static void main (String[] args){
        Tree t=new Tree();
        t.insert(100);
        t.insert(90);
        t.insert(70);
        t.insert(30);
        t.insert(35);
        t.insert(77);
        t.insert(99);
        t.insert(120);
        t.insert(22);
        t.insert(113);
        t.inorder(t.root);
        System.out.println();
        t.preorder(t.root);
        //t.postorder();
         
    }
}
