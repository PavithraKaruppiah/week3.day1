package week3.day1;

//override the method deposit in AxisBank.
public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("deposit from axis bank");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank deposit =new AxisBank();
		deposit.saving();
		deposit.fixed();
		deposit.deposit();
	
	}
}
