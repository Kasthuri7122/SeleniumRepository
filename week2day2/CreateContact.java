package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Kasthu");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Mad");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Manual Tester");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("Kasthuri7122@gmail.com");
		driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']")).sendKeys("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Nothing");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		
		
		
		
		
		
		
	}

}
