package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAss {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kasthu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kasthuri7122@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("K@12hr");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("7");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jun");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1997");
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
