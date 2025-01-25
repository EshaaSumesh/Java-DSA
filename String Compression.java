public class Main {
    public static void main(String[] args) {
        String a = "aaabbddddcccaa";
        String result= "";
        int c=1;

        for (int i = 0; i<a.length(); i++) {
            if((i+1)<a.length() && a.charAt(i)==a.charAt(i+1)){
                c+=1;
                continue;
            }
            else{
                result=result+a.charAt(i);
                result=result+c;
                c=1;
            
            } 
        }
        
        System.out.print(result);
    }
    } 
    
