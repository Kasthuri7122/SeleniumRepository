package week1.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kasthuri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		WebElement SourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(SourceDD);
		sec.selectByIndex(4);
		WebElement SourceDD1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1 = new Select(SourceDD1);
		sec1.selectByVisibleText("Automobile");
		WebElement SourceDD2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec2 = new Select(SourceDD2);
		sec2.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
