package seleniumAdditionalTopic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class TakeParticulerElementScreenShot {

	 public static void main(String[] args) throws IOException {
	        //set the location of chrome browser
System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");	        
	        ChromeOptions option = new ChromeOptions();
	        option.addArguments("--remote-allow-origins=*");
	        // Initialize browser
	        WebDriver driver = new ChromeDriver(option);
	        
	        //navigate to url
	        driver.get("https://demoqa.com");
	        
	        // Locate the element on the web page
	        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
	        
	        // Get screenshot of the visible part of the web page
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        // Convert the screenshot into BufferedImage
	        BufferedImage fullScreen = ImageIO.read(screenshot);
	        
	        //Find location of the webelement logo on the page
	        Point location = logo.getLocation();
	        
	        //Find width and height of the located element logo
	        int width = logo.getSize().getWidth();
	        int height = logo.getSize().getHeight();

		//cropping the full image to get only the logo screenshot
	        BufferedImage logoImage = fullScreen.getSubimage(location.getX(), location.getY(),
	                width, height);
	        ImageIO.write(logoImage, "png", screenshot);
	        
	        //Save cropped Image at destination location physically.
	        Files.copy(screenshot, new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\abcd\\SeleniumAutomationAdditionalTopic\\SnapShots\\particularElementScreenshot.PNG"));

	        driver.quit();
	    }
}
