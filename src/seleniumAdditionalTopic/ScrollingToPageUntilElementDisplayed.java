package seleniumAdditionalTopic;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScrollingToPageUntilElementDisplayed {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("Arjun");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='vtiger CRM 5.2.1']"));

		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",element);
		
		Thread.sleep(5000);
		
		DateFormat datef = new SimpleDateFormat("MM_dd_yyyy HH_MM_ss a");
		String dateTime = datef.format(new Date());
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);

		File finaldestination = new File(
				System.getProperty("user.dir") + "/SnapShots/" + "myScreenShot" + dateTime + ".png");
		
			Files.copy(source, finaldestination);
		
	}

}
