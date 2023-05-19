package week3.day1;

public class SmartPhone extends AndroidPhone{
	public void takevideo() {
		System.out.println("Take video from Android Phone");
	}
		public static void main(String[] args) {
		SmartPhone smart = new SmartPhone();
		smart.takevideo();
	}

}
