package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafgroundbutton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		boolean isEnabled =driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).isEnabled();
		if(isEnabled) {
			System.out.println("Button is Enabled");
		}
		else {
			System.out.println("Button is Disabled");
		}
		WebElement element =driver.findElement(By.xpath("//span[text()='Submit']"));
		Point location = element.getLocation();
		System.out.println("X,Y - coordinates : " + location);
		WebElement element1 =driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/button/span[2]"));
		String color = element1.getCssValue("color");
		System.out.println();
	}

}
