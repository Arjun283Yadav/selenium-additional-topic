package seleniumAdditionalTopic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PerformCopyAndPasteUsingActionsClass {

	public static void main(String[] args) throws AWTException {
		copyAndPasteUsingRobotClass();

	}
	
	public static void copyAndPasteExample1() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Replace with your preferred browser
        driver.get("http://localhost:8888/"); // Replace with your test URL
        driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("Arjun");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
        
		 // Find the element to copy
        WebElement copyElement = driver.findElement(By.xpath("//a[normalize-space()='Gmail Bookmarklet']"));

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Copy the text
        actions.moveToElement(copyElement).perform();
        actions.keyDown(Keys.CONTROL).perform();
        actions.sendKeys("c").perform();
        actions.keyUp(Keys.CONTROL).perform();

        // Find the element to paste
        WebElement pasteElement = driver.findElement(By.id("qccombo"));

        // Paste the text
        actions.moveToElement(pasteElement).perform();
        actions.keyDown(Keys.CONTROL).perform();
        actions.sendKeys("v").perform();
        actions.keyUp(Keys.CONTROL).perform();
	}
	
	public static void copyAndPasteUsingRobotClass() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Replace with your preferred browser
        driver.get("http://localhost:8888/"); // Replace with your test URL
        driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("Arjun");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		 // Find the element to copy
        WebElement copyElement = driver.findElement(By.xpath("//body[1]/table[5]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/table[3]/tbody[1]/tr[1]/td[1]/a[1]"));
        copyElement.click();

        // Create an instance of the Robot class
        Robot robot = new Robot();

        // Copy the text
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Find the element to paste
        WebElement pasteElement = driver.findElement(By.xpath("//input[@name='query_string']"));
        pasteElement.click();

        // Paste the text
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	

}
