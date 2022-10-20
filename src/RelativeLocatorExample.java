import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocatorExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement textbox = driver.findElement(By.cssSelector("[name ='name']"));

		System.out.println(driver.findElement(with(By.tagName("label")).above(textbox)).getText());

		WebElement DOB = driver.findElement(By.xpath("//label[@for='dateofBirth']"));

		driver.findElement(with(By.tagName("input")).below(DOB)).click();

		WebElement checkboxlabel = driver.findElement(By.className("form-check-label"));

		driver.findElement(with(By.id("exampleCheck1")).toLeftOf(checkboxlabel)).click();

		WebElement radioid = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.cssSelector(".form-check-label")).toRightOf(radioid)).getText());
	}

}
