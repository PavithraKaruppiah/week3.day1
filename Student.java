package week3.day1;
//create above 3 class and call all your class methods into the Student using multilevel inheritance.
public class Student extends Deparment {
	public void studentName() {
		System.out.println("student Name");
	}
	
	public void studentdept() {
		System.out.println("student department");
	}
	
	public void studentID() {
		System.out.println("student ID");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student col =new Student();
		col.departmentName();
		col.studentdept();
		col.studentID();
		col.studentName();
		col.collegeCode();
		col.collegeName();
		col.collegeRank();
}
	}

