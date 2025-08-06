import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
  

        s = s.toLowerCase(); 

        int mid = s.length() / 2;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < mid; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'o' || ch == 'e' || ch == 'i' || ch == 'u') {
                count1++;
            }
        }

       
        for (int i = mid; i < s.length(); i++) 
        { 
            char ch = s.charAt(i);
         
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')   
            {
                count2++;
            }
        }

        if (count1 == count2) 
        {
            System.out.println("YES");
        } 
        else 
        {
            System.out.println("NO");
        }
    }
}
