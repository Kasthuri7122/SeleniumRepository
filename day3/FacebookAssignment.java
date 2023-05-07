package week1.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Kasthuri");
		driver.findElement(By.name("lastname")).sendKeys("R");
		driver.findElement(By.name("reg_email__")).sendKeys("7871960417");
		driver.findElement(By.id("password_step_input")).sendKeys("K@1234");
		WebElement drop = driver.findElement(By.id("day"));
		Select drp1=new Select(drop);
		drp1.selectByIndex(7);
		WebElement drop1 = driver.findElement(By.id("month"));
		Select drp2=new Select(drop1);
		drp2.selectByVisibleText("Jun");
		WebElement drop2 = driver.findElement(By.id("year"));
		Select drp3=new Select(drop2);
		drp3.selectByVisibleText("1997");
		driver.findElement(By.name("sex")).click();
		
		
		
		
		
		
		
		

	}

}
