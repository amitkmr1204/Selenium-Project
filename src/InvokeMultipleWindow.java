import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMultipleWindow {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Switch Window

		driver.switchTo().newWindow(WindowType.WINDOW);

		Set<String> windowhandle = driver.getWindowHandles();

		Iterator<String> itr = windowhandle.iterator();

		String parentid = itr.next();

		String childid = itr.next();

		driver.switchTo().window(childid);

		driver.get("https://rahulshettyacademy.com/");

		String coursetext = driver.findElements(By.cssSelector("a[href*='courses.rahulshettyacademy.com/p/core-java']")).get(1).getText();
				
		driver.switchTo().window(parentid);
	 WebElement nameTextbox	= driver.findElement(By.name("name"));
	 nameTextbox.sendKeys(coursetext);
	 
	 //Partial screenshot
	 
	File src =  nameTextbox.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\KUMARA5\\textbox.png"));
	
	//Get Height and Width
	
	System.out.println(nameTextbox.getRect().getDimension().getHeight());
	System.out.println(nameTextbox.getRect().getDimension().getWidth());
	
		driver.quit();
		
		//driver.close();

	}

}
