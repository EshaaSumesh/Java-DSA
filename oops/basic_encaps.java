
class Main
{
    public static void main(String[] args) 
    {
        Student s=new Student();
        s.setRoll(1);
        s.setName("Reze");
        s.viewRoll();
        s.viewName();
    }
}
class Student
{
    private int rollNo;
    private String name;
    
    void setName(String s)
    {
        this.name=s;
        System.out.println("Name set successfully");
    }
    
    void viewName()
    {
         System.out.println("Name:"+this.name);
    }
    void setRoll(int n) //set-writes
    {
        this.rollNo=n;
        System.out.println("Roll no set successfully");
        
    }
    void viewRoll() //getter-view(read)
    {
        System.out.println("RollNo:"+this.rollNo);
    }
}
