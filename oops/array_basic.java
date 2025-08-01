
class Main
{
    public static void main(String[] args) 
    {
     int[] marks={10,20,30,40,50};
     for(int j=0;j<2;j++)
     {
     //System.out.print(marks.length);//length
     //System.out.println(marks[0]);
     
     {
     for(int i=0;i<marks.length;i++)
     {
         if(j==0)
         {
         System.out.print(marks[i]+ " ");
         }
         //marks[i]+=10;
         else
         {
            System.out.print(marks[i]+10+ " "); 
         }
     }
      System.out.println();
      
    }   
       
 }
}
}

