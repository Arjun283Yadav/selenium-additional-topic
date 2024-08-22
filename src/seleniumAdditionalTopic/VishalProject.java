package seleniumAdditionalTopic;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class VishalProject {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://illuminzqfitest.qfivr.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/// login in application
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("$hVcX7Zw8D1qSw8J?&7");
		driver.findElement(By.xpath("//input[@name='userlogin']")).click();
		
		/// navigate to main page
		driver.findElement(By.xpath("//a[@title=\"Home Page\"]//img")).click();
		
		//creating a new survey
		driver.findElement(By.xpath("//div[@class=\"dropdown-new-survey\"]//button")).click();
		driver.findElement(By.xpath("//p[text()=\"Create New Survey\"]")).click();
		
		// after clicking on that form is present in iframe
		// switching to frame
		
		WebElement weFrame = driver.findElement(By.xpath("//iframe[@class='autoHeight thickbox']"));
		driver.switchTo().frame(weFrame);
		
		// after switching into the frame now entering information 
		driver.findElement(By.xpath("//input[@id='project_name']")).sendKeys("Sofia");
		driver.findElement(By.xpath("//input[@id='survey_title']")).sendKeys("Creating a new survery");
		WebElement weDropdown = driver.findElement(By.xpath("//select[@id='project_type']"));
		Select select = new Select(weDropdown);
		select.selectByValue("1");
		
		// Waiting for some time
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Create']")).click();
		Thread.sleep(2000);
		
		/// now switch to main page
		driver.switchTo().defaultContent();
		
		/// clicking on new page
		//driver.findElement(By.xpath("//a[@id='add-canvas']//span")).click();
		
		// click on chose list
		driver.findElement(By.xpath("//p[@rel='List']")).click();
		Thread.sleep(2000);
		
		// taking a snapshot
		TakesScreenshot tss = (TakesScreenshot) driver;
		DateFormat datef = new SimpleDateFormat("MM_dd_yyyy HH_MM_ss a");
		String dateTime = datef.format(new Date());
		
		File source = tss.getScreenshotAs(OutputType.FILE);

		File finaldestination = new File(
		System.getProperty("user.dir") + "/SnapShots/"+"Q-Fi_Screenshot"+ dateTime + ".png");
		
			Files.copy(source, finaldestination);
			
			//driver.findElement(By.xpath("//a[text()='Enter Fullscreen']")).click();
			
	}

}
