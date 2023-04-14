import mypackage.Student;

public class Demo {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Vaibhav Mojidra");
		s.setRollNo(101);
		
		System.out.println("Student : "+s.getRollNo()+" "+s.getName());

	}

}
