class Main
{
    public static void main(String[] args) 
    {
        for(int i=0;i<5;i++)//row
        {
            for(int j=0;j<5;j++)//column
            {
                if(i==0 || i==4 || (i==1) && (j==3) || (i==2) && (j==2) || (i==3) && (j==1))
                System.out.print("* ");
                else
                System.out.print("  ");
            }
             System.out.println();
        }
       
    }
}
