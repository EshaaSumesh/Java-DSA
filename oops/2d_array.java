import java.util.*;

class Main 
{
    public static void main(String[] args) 
    {
        int [][] arr=new int[2][3];//2 classes ,each 3 students = 6 students 
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<2;i++)
        {
            System.out.println("Class"+(i+1) +": ");
            for(int j=0;j<3;j++)
            {
                System.out.println("Student"+(j+1) +": ");
                arr[i][j]=sc.nextInt();
            }
        }
        
         for(int i=0;i<2;i++)
        {
            System.out.println("Class"+(i+1) +": ");
            for(int j=0;j<3;j++)
            {
                System.out.println("Student"+(j+1) +": " +arr[i][j]);
             
            }
        }
        
    }
}
