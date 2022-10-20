import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ColumnSorting {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> names = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> actualname = names.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>sortedname = actualname.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(actualname.equals(sortedname));
		
		List<String> price;
	do {
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		
     	price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiprice(s)).collect(Collectors.toList());
    for(String p:price) {
    	System.out.println(p);
  
    }
    	if(price.size()<1) {
    	
    	driver.findElement(By.cssSelector("[aria-label='Next']")).click();
    }

   
	}while(price.size()<1);
	}

	private static String getVeggiprice(WebElement s) {
		String searchprice = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return searchprice;
	}

}
