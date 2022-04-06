package week3.day1;
//create above 2 class and call all your class methods into the Desktop using single inheritance.
public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Desktop Size");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop desk =new Desktop();
		desk.computerModel();
		desk.desktopSize();
		
	}

}
