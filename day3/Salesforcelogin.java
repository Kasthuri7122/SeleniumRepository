package week1.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforcelogin {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
driver.findElement(By.id("password")).sendKeys("Leaf@1234");
driver.findElement(By.id("Login")).click();
String title = driver.getTitle();
System.out.println(title);
	}

}
