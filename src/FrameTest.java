import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		// driver.switchTo().frame(0);

		WebElement val1 = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(val1);
		driver.findElement(By.id("draggable")).click();

		Actions a1 = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a1.dragAndDrop(source, target).build().perform();

		driver.switchTo().defaultContent();
		// driver.findElement(By.xpath("//a[text()='Accept']")).click();

	}

}
