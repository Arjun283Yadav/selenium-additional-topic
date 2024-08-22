package seleniumAdditionalTopic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZX {

	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement weDep = driver.findElement(By.xpath("//input[@title='Select Departure date for availability']"));
		weDep.click();
		String cd = weDep.getAttribute("value");
		int currentData = Integer.parseInt(cd.substring(0, cd.indexOf("-")));
		System.out.println(currentData);
		
		LocalDate date = LocalDate.now().plusDays(30);
        String dateString = date.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println(dateString);
        
        int intiDays = 0;
       List<WebElement> weListOfDays = driver.findElements(By.xpath("//table[@class='WithBorder']//tbody//tr//td//table//tr//td[starts-with(@onclick,'DoDateSelect')]"));
       WebElement singleWeb = weListOfDays.get(2);
       singleWeb.click();
       
       
//       int totalDays = weListOfDays.size();
//       for (int i = currentData; i < totalDays; i++) {
//    	  WebElement singleWeb = weListOfDays.get(intiDays);
//    	  
//		if (Integer.parseInt(singleWeb.getText()) > currentData) {
//			
//			if (Integer.parseInt(singleWeb.getText())==Integer.parseInt(dateString) ) {
//				singleWeb.click();
//				break;
//			}
//		}
//		intiDays++;
//	}
       
       Thread.sleep(10000);
       
       driver.quit();
		
//		List<WebElement> listOfMonth = driver.findElements(By.xpath("//table[@class=\"WithBorder\"]//table//tr//td[@colspan=\"7\"]"));
//		for (int i = 0; i < listOfMonth.size(); i++) {
//			WebElement singleMonth = listOfMonth.get(i);
//			String monthName = singleMonth.getText();
//			System.out.println(monthName);
//			if (monthName.contains("Aug")) {
////				singleMonth.cli
////				System.out.println(" Find Month : " + monthName);
//				//table[@class='WithBorder']//tbody//tr//td//table//tr[1]//td
//				//table[@class='WithBorder']//tbody//tr//td//table//tr//td[starts-with(@onclick,'DoDateSelect')]
//			} else {
//				System.out.println(" Month Not Found ......");
//			}
//		}
//	
	}

}
