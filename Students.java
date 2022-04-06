package week3.day1;
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
public class Students {

	
	public void getStudentInfo(int id)
	{
		System.out.println(1001);
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println(2002 + "  pavi");
	}
	public void getStudentInfo(String name,long phonenumber)
	{
		System.out.println("pk@gmail.com   " + 9898098908908L );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students info =new Students();
		info.getStudentInfo(0);
		info.getStudentInfo(0, null);
		info.getStudentInfo(null, 0);
	}

}
