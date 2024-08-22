package seleniumAdditionalTopic;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class HandlePushNotificationInChrome {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		/*
		 * Write the code to handle push notification in chrome browser
		 *  we need ChromeOption class
		 *  and then we pass the value => --disable-notifications
		 */
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		
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
