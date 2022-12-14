import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {

		String name = "Amit";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Locator2 d = new Locator2();
		String password = d.getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();

	}

	public String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		// Please use temporary password 'rahulshettyacademy' to Login.
		String passwordtext = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordarray = passwordtext.split("'");
		String[] passwordarray2 = passwordarray[1].split("'");
		String password = passwordarray2[0];
		return password;

	}

}
