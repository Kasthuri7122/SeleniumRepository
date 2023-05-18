package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundInput {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='col-12']/input[1]")).sendKeys("Babu Manickam");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys(",India");
		boolean isEnabled =driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
		if(isEnabled) {
			System.out.println("btn is enabled");
		}
		else {
			System.out.println("btn is disabled");
		}
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		String text = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("kasthuri7122@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("Hello All");
	}

	private static WebElement Byname(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String Ingettext() {
		// TODO Auto-generated method stub
		return null;
	}

}
