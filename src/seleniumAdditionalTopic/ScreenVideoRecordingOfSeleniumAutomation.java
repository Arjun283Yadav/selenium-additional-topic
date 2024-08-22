package seleniumAdditionalTopic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class ScreenVideoRecordingOfSeleniumAutomation {

	public static void main(String[] args) throws Exception {
		
		ScreenRecorderUtil.startRecord("main");
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("Arjun");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='vtiger CRM 5.2.1']"));

		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",element);
		
		Thread.sleep(2000);
		
		ScreenRecorderUtil.startRecord("Demo");
		

	}

}
