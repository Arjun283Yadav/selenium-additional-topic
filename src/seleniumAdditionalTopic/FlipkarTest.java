package seleniumAdditionalTopic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FlipkarTest {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
		Set<String> listwindow = driver.getWindowHandles();
		String expURL = "https://www.flipkart.com/apple-iphone-15-black-128-gb/p/itm6ac6485515ae4?pid=MOBGTAGPTB3VS24W&lid=LSTMOBGTAGPTB3VS24WVZNSC6&marketplace=FLIPKART&q=iphone&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=34bbbd32-c6f3-42d0-9099-18cfe224c998.MOBGTAGPTB3VS24W.SEARCH&ppt=sp&ppn=sp&ssid=zj3nedbskw0000001724147457538&qH=0b3f45b266a97d70";
		for (String string : listwindow) {
			driver.switchTo().window(string);
			String actURL = driver.getCurrentUrl();
			if (expURL.contains(actURL)) {
				break;
			}
		}
//		System.out.println(driver.findElement(By.xpath("//div[normalize-space()='You might be interested in']")).getText());
		WebElement wescroll = driver.findElement(By.xpath("//a[@class=\"QqFHMw WPJGw9\"]"));

		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);", wescroll);

		WebElement we = driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
		we.click();
//		jss.executeScript("arguments[0].click()", we);

		driver.findElement(By.xpath("//button[@class=\"QqFHMw zA2EfJ _7Pd1Fp\"]")).click();
		TakesScreenshot tss = (TakesScreenshot) driver;
		File temp = tss.getScreenshotAs(OutputType.FILE);
		File actual = new File(
				"C:\\Users\\LENOVO\\Desktop\\mySelenium_WS\\SeleniumAutomationAdditionalTopic\\SnapShots\\FlipkartScreenshot.png");
		Files.copy(temp, actual);
	}
}
