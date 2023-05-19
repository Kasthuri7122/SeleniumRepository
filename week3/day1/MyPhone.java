package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		iPhone ip = new iPhone();
		ip.startApp();
		ip.increasevolume();
		ip.shutdown();
		System.out.println("______________________________");
		ip.makecall();
		System.out.println("______________________________");
		ip.sendSMS();
		
	}

}
