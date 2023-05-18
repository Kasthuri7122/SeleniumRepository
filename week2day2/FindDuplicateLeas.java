package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindDuplicateLeas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("samson.e@hcl.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		WebElement str1=driver.findElement(By.linkText("SAMSON"));
		WebElement str2=driver.findElement(By.id("viewLead_firstNamesp"));
		if(str1.equals(str2));
		System.out.println("Both are equal");
		
		
		
	}

}
