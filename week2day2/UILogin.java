package week2day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UILogin {

	public static void main(String[] args) throws IOException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://acme-test.uipath.com/login");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	driver.close();
	driver.quit();
	Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
	System.out.println("Chrome driver sucessfully terminated");
	}

}
