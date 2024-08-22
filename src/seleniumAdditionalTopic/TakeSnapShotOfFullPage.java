package seleniumAdditionalTopic;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
public class TakeSnapShotOfFullPage {

	/*
	 * ctrl+shift+c ---> to stop all action which is running in command prompt 
	 */
	
	 public static void main(String[] args) throws IOException {
	        //set the location of chrome browser
	        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	        
	        // Initialize browser
	        WebDriver driver = new ChromeDriver();
	        
	        //navigate to url
	        driver.get("https://demoqa.com");

	        // capture screenshot and store the image
	        Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	        ImageIO.write(s.getImage(),"PNG",new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\abcd\\SeleniumAutomationAdditionalTopic\\SnapShots\\fullPageScreenshot.png"));
	        
	        //closing the webdriver
	        driver.close();
	    }
}
