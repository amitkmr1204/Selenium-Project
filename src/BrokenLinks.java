import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		SoftAssert a = new SoftAssert();

		for (WebElement link : links)

		{

			String url = link.getAttribute("href");
			System.out.println(url);

			// get all urls tied up with the links

			// java methods will call urls and gets you the status code

			// if status code>400 means link is broken

			// String url1 =
			// driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			conn.setRequestMethod("HEAD");

			conn.connect();

			int responsecode = conn.getResponseCode();

			System.out.println(responsecode);

			a.assertTrue(responsecode < 400, "link with text is broken link:" + link.getText());

		}

		a.assertAll();

	}

	private static Object getReturnCode(WebElement link) {

		return null;

	}

}
