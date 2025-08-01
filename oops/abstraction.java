
class Main
{
    public static void main(String[] args) 
    {
        Engg e1=new Engg();
        e1.formal();
        e1.ites();
        e1.sal();
    }
}

interface dressCode
{
    void formal();
}
class Engg implements dressCode,salary
{
    public void formal()
    {
        System.out.println("Uniform:Grey & Black");
    }
    public void ites()
    {
        System.out.println("Salary:"+30000);
    }
}
class Pharma implements dressCode
{
    public void formal()
    {
         System.out.println("Uniform:Lab Coat");
    }
    public void ites()
    {
       System.out.println("Salary:"+20000);
    }
}
interface salary
{
    void ites();
    default void sal()
    {
        System.out.println("Min.Wages:"+10000);
    }
}
