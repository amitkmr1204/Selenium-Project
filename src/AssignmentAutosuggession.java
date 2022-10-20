import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssignmentAutosuggession {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		
	/*List<WebElement> search =	driver.findElements(By.cssSelector("ul.ui-menu.ui-widget.ui-widget-content.ui-autocomplete.ui-front"));
	for(int i=0;i<search.size();i++) {
	String searchtext =	search.get(i).getText();
	System.out.println(searchtext);
	
	if(searchtext.equalsIgnoreCase("India")){
		driver.findElement(By.className("ui-menu-item-wrapper")).click(); 
		}
	}*/
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		
	
		

	}

}
