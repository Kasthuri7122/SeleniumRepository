package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String name = "madam";
		String rev = " ";
		char [] ch = name.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			rev += name.charAt(i);
		}
			if (name.equalsIgnoreCase(rev))
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not a Palindrome");
			}
		}
	

	}


