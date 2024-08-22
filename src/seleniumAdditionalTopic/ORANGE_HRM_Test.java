package seleniumAdditionalTopic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORANGE_HRM_Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Username']//parent::div//parent::div//div//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//label[text()='Password']//parent::div//parent::div//div//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
		
		List<WebElement> listOfWeb = driver.findElements(By.xpath("//a[@class='oxd-userdropdown-link']"));
		for (WebElement webElement : listOfWeb) {
			System.out.println(webElement.getText());
		}
	
	
	}
}
