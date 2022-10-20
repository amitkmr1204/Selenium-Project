import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions a1 = new Actions(driver);
		//move to specific element
		a1.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).contextClick().build().perform();
	    WebElement val1 = 	driver.findElement(By.id("twotabsearchtextbox"));
		a1.moveToElement(val1).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		System.out.println("This is git demo");
		System.out.println("Git connectivity");

	}

}
