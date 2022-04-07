package week3.day1;
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
public class StudentsInfo {

	
	public void getStudentInfo(int id)
	{
		System.out.println(id + "  Student ID");
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println(id +" "+  name);
	}
	public void getStudentInfo(String email,long phonenumber)
	{
		System.out.println(email +" " + phonenumber );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsInfo info =new StudentsInfo();
		info.getStudentInfo(4000);
		info.getStudentInfo(5000, "pavithra");
		info.getStudentInfo("pk@gmail.com",9898098908908L);
	}

}
