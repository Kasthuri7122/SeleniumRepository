package week3.day1;

public class Automation extends MultipleLanguage
{

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void Java() {
	System.out.println("Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}
public static void main(String[] args) {
	Automation at = new Automation();
	at.Java();
	at.Selenium();
	at.python();
	at.ruby();
}
}
