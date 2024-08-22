package seleniumAdditionalTopic;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ZoomInAndZoomOut {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//	ZoomIn to 200%
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.body.style.zoom='200%'");
		
		TakesScreenshot tss = (TakesScreenshot) driver;
		DateFormat datef = new SimpleDateFormat("MM_dd_yyyy HH_MM_ss a");
		String dateTime = datef.format(new Date());
		
		File source = tss.getScreenshotAs(OutputType.FILE);

		File finaldestination = new File(
		System.getProperty("user.dir") + "/SnapShots/"+"MyScreenShot"+ dateTime + ".png");
		
			Files.copy(source, finaldestination);
			
			Thread.sleep(5000);
			
		// 	ZoomOut to 50%	
			
			jse.executeScript("document.body.style.zoom='50%'");
			
	
			File source2 = tss.getScreenshotAs(OutputType.FILE);

			File finaldestination2 = new File(
			System.getProperty("user.dir") + "/SnapShots/"+"MyScreenShot"+ dateTime + ".png");
			
				Files.copy(source2, finaldestination2);
			
				Thread.sleep(5000);
				
		// Zoom to Default 100%
				
				jse.executeScript("document.body.style.zoom='100%'");
}
}
