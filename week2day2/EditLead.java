package week2day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[1]")).click();
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input[1]")).sendKeys("prasanna");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[3]")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Instagram");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		driver.quit();
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		System.out.println("Chrome driver sucessfully terminated");
	}

}
