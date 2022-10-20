import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Total link count in webpage
		System.out.println(driver.findElements(By.tagName("a")).size());

		// footerdriver link count
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement cornerdriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td/ul[1]"));
		System.out.println(cornerdriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < cornerdriver.findElements(By.tagName("a")).size(); i++) {

			String cornerlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			cornerdriver.findElements(By.tagName("a")).get(i).sendKeys(cornerlink);
		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();

		while (itr.hasNext()) {
			System.out.println(driver.switchTo().window(itr.next()).getTitle());

		}

	}

}
