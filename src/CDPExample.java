import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v103.emulation.Emulation;

public class CDPExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		DevTools devtools = driver.getDevTools();

		devtools.createSession();

		Map<String, Object> coordinate = new HashMap<String, Object>();

		coordinate.put("latitude", 10);
		coordinate.put("longitude", 56);
		coordinate.put("accuracy", 1);

		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinate);

		driver.get("http://google.com");

		driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);

		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();

		String title = driver.findElement(By.cssSelector(".our-story-card-title")).getText();
		System.out.println(title);

	}

}
