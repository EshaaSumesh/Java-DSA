import java.util.*;
class Main
{
    public static void main(String[] args) 
    {
       SinglyLinkedList list=new SinglyLinkedList();
       list.add(10);
       list.add(20);
       list.display();
    }
}   
class Node
{
  int data;
  Node next; //self-referential node(address of node)
  
  Node(int data)//contructor -stores data =10
  {
       this.data=data;//10
       this.next=null;
  }
}
class SinglyLinkedList
{
   Node head;//object of Node class
   void add(int data)//data=10
   {
       Node newNode=new Node(data);//creating object for Node class
       if(head==null) head=newNode;
       else
       {
           Node temp=head; //refernce for head
           while(temp.next!=null) temp =temp.next;//if its null>tail node , if not check next node address
           temp.next=newNode;
       }
   }
   void display()
   {
       Node temp=head;
       while(temp!=null)
       {
           System.out.print(temp.data +"-->");
           temp=temp.next;
           
       }
    System.out.print("NULL");
   }
}
