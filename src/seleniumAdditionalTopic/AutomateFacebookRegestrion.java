package seleniumAdditionalTopic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AutomateFacebookRegestrion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();/// click on create new account
		driver.findElement(By.name("firstname")).sendKeys("Arjun");/// enter first name
		driver.findElement(By.name("lastname")).sendKeys("Yadav");/// enter last name
		driver.findElement(By.name("reg_email__")).sendKeys("8956743452");/// enter mobile number
		driver.findElement(By.id("password_step_input")).sendKeys("Arj12@ya");/// enter password
		
		WebElement webDay = driver.findElement(By.id("day"));
		
		Select selday = new Select(webDay);/// select day
		selday.selectByValue("30");
		
		WebElement webMonth = driver.findElement(By.id("month"));

		Select selmonth = new Select(webMonth);/// select month
		selmonth.selectByValue("12");
		
		WebElement webYear = driver.findElement(By.id("year"));

		
		Select selyear = new Select(webYear);// select year
		selyear.selectByValue("1999");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();/// click on Gender
		
		Thread.sleep(6000);
		
		//driver.findElement(By.xpath("//button[@name="websubmit"]")).click();/// click on sign-up
		




	}
}
