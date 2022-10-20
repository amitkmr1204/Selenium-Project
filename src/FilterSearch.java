import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterSearch {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.findElement(By.id("search-field")).sendKeys("Rice");
List<WebElement> vegsearch = driver.findElements(By.xpath("//tr/td[1]"));

System.out.println(vegsearch.size());
 List<WebElement> filtersearch = vegsearch.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
 System.out.println(filtersearch.size());
 Assert.assertEquals(vegsearch.size(), filtersearch.size());
	
	}

}
