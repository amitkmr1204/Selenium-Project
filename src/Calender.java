import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@class='sc-egiyK hhbEKs']/div[3]/div/p/span[@class='sc-ieecCq gToiRQ fswDownArrow']")).click();
		driver.findElement(By.xpath("//div[@class='sc-fotOHu hmnmkS']/div[3]/div/p/span[@class='sc-kfPuZi dprjVP fswDownArrow']")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText().contains("November"))
		{
			
			driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
			
		}

		List<WebElement> day = driver.findElements(By.className("DayPicker-Day"));
		int count = driver.findElements(By.className("DayPicker-Day")).size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {

		String datetext = day.get(i).getText();

			if (datetext.equalsIgnoreCase("21")) {
				driver.findElements(By.className("DayPicker-Day")).get(i).click();
				break;
			}
		}
		
		driver.findElement(By.className("fswTrvl__done")).click();

	}

}
