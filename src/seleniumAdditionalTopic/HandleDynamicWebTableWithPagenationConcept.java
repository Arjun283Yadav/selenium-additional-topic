package seleniumAdditionalTopic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicWebTableWithPagenationConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://44.219.48.2/");
		driver.manage().window().maximize();
//		WebElement username =  driver.findElement(By.xpath("//input[@id='input-username']"));
//		username.clear();
//		username.sendKeys("demo");
//		
//		WebElement password =  driver.findElement(By.xpath("//input[@id='input-password']"));
//		password.clear();
//		password.sendKeys("demo");
//		
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//		
//		// close window
//		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
//		{
//			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
//		}
//	
//	
	
	
	
	
	}
}
