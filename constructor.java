class Student {
    static String dept="CSE";
    String name;
    int cgpa;
    
    Student (String name,int cgpa){
        
        this.name=name;
        this.cgpa=cgpa;
    }
    
    void display(){
        System.out.println("NAME:" +name);
        System.out.println("dept:" +dept);
        System.out.println("cgpa:" +cgpa);
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
		Student [] s=new Student[5];
		s[0]=new Student("Anya",9);
		s[1]=new Student("Arya",8);
		s[2]=new Student("tara",7);
	    s[3]=new Student("SAnya",10);
	    s[4]=new Student("Maya",9);
	    
	    for(int i=0;i<5;i++){
	        s[i].display();
	    }
	}
}
