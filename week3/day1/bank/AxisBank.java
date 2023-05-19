package week3.day1.bank;

public class AxisBank extends BankInfo{
	
@Override 
public void deposit() {
	System.out.println("Deposit Balance");
}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.fixed();
		ab.saving();
		ab.deposit();
		
		BankInfo bi = new BankInfo();
		bi.deposit();
	}

}
