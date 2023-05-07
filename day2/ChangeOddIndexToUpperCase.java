package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test ="changeme";
		char[] ch= test.toCharArray();
		for (int i = 0; i < test.length(); i++) {
			if(i%2==1)
			{
				System.out.println(test.substring(i,i+1).toUpperCase());
			}
			else
			{
				System.out.println(test.substring(i,i+1));
			}
		}
	
	}

}
