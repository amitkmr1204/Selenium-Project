import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Ecommerceaddcart {
	

	public static void main(String[] args) throws InterruptedException {
		
		String[] productsearch = { "Brocolli", "Beetroot", "Cucumber" };

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
				
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver, productsearch);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] productsearch) {
		int j = 0;

		List<WebElement> name = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < name.size(); i++) {

			// Brocolli - 1 Kg
			String[] productname = name.get(i).getText().split("-");
			String formatedname = productname[0].trim();

			// convert array into array list for easy search
			List itemsneeds = Arrays.asList(productsearch);
			if (itemsneeds.contains(formatedname)) {
				j++;
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == productsearch.length) {
					break;
				}
			}

		}
	}

}
