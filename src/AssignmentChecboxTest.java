
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentChecboxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String checkboxval = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();

		WebElement drpval = driver.findElement(By.id("dropdown-class-example"));
		Select s1 = new Select(drpval);
		s1.selectByVisibleText(checkboxval);

		driver.findElement(By.id("name")).sendKeys(checkboxval);
		driver.findElement(By.id("alertbtn")).click();
		String alerttext = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println(alerttext);
		if (alerttext.contains(checkboxval)) {
			System.out.println(checkboxval + " value is available in alert popup");
		} else {
			System.out.println("Value is not available in alert popup");
		}

	}

}
