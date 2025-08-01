class Main 
{
    public static void main(String[] args)
    {
        int [] arr={1,2,3};
        for(int i=0;i<arr.length/2;i++)
        {
            if(arr[i]==arr[arr.length-i-1])
            {
                continue;
            }
            else
            {
                System.out.println("Not Palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
        
    }
}
