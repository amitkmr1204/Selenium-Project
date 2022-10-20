
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		WebElement table = driver.findElement(By.id("product"));	
		int rowcount = table.findElements(By.tagName("tr")).size();
		System.out.println(rowcount);
		int colcount = table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();

		System.out.println(colcount);

		List<WebElement> rowtext = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		for (int i = 0; i < rowtext.size(); i++) {
			System.out.println(rowtext.get(i).getText());

		}

	}

}
