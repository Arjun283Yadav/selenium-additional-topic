package seleniumAdditionalTopic;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class HandleingAutoSuggestionTextField {

	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		WebElement element = driver.findElement(By.id("tags"));
		element.sendKeys("A");
		/*
		 * we are using wait because the option are taking some time 
		 * to Lode and WebDriver is fast
		 */
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(element, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		

		DateFormat datef = new SimpleDateFormat("MM_dd_yyyy HH_MM_ss a");
		String dateTime = datef.format(new Date());
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);

		File finaldestination = new File(
				System.getProperty("user.dir") + "/SnapShots/" + "myScreenShot" + dateTime + ".png");
		
			Files.copy(source, finaldestination);
		
	}
	/*
	 * Link: https://www.saucedemo.com/
	 * Type: E-commerce

Description: This is another example of a simple online store, perfect for UI testing.

Link: https://www.demoblaze.com/
	 */

}
