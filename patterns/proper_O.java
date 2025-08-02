class Main
{
    public static void main(String[] args) 
    {
        for(int i=0;i<5;i++)//row
        {
            for(int j=0;j<5;j++)//column
            {
                if(
                (i==0   &&   j>0 && j<4)
                ||(i==4 && j>0 && j<4 ) 
                ||(j==0 && i>0 && i<4)
                ||(j==4 && i>0 && i<4 )
                )
                System.out.print("* ");
                else 
                System.out.print("  ");
            }
             System.out.println();
        }
       
    }
}
