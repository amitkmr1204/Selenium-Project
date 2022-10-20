import java.io.IOException;
import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicAuth {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Basic Auth")).click();
		
		driver.navigate().to("https://pdf.online/pdf-to-word-converter");
		
		driver.findElement(By.cssSelector("[class*='select-files-button']")).click();
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Selenium\\Fileupload.exe");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button[class='chakra-button css-157ld3s']")));
		
		driver.findElement(By.cssSelector("button[class='chakra-button css-157ld3s']")).click();
		
		System.out.println("Scuess Message");
		
		
		
		

	}

}
