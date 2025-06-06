import java.util.*;

class Main 
{
    static final int MAXSIZE=10;
    static int [] stack=new int[MAXSIZE];
    static int top=-1;
    static void push(int val)
    {
        if(top>MAXSIZE)
        {
            System.out.println("stack overflow");
            return;
        }
        else
        {
        stack[++top]=val;
        System.out.println(val +" is pushed into stack");
        }
    }
    
    static void pop()
    {
        if(top==-1)
    {
        System.out.print("Stack is empty");
        return;
    }
        
        top--;
        System.out.print(stack[top--]+" is popped.");
    }
    static void peek()
    {
    if(top==-1)
    {
        System.out.print("Stack is empty");
        return;
    }
        System.out.print("The top element is"+stack[top]);
    }
    public static void main(String[] args)
    {
      push(10);
      push(100);
      push(200);
      pop();
    }
}
