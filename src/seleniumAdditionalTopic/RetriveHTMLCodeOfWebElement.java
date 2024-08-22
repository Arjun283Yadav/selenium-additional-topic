package seleniumAdditionalTopic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RetriveHTMLCodeOfWebElement {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		
		WebElement element = driver.findElement(By.xpath("//img[@alt='The honest Open Source CRM']"));
		
		String htmlCodeOfWebElement = element.getAttribute("outerHTML");
		System.out.println(htmlCodeOfWebElement);
		
		Thread.sleep(2000);
		driver.close();

	}

}
