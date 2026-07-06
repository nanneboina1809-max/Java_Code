import java.util.List;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.get("https://pharmeasy.in/");
	Thread.sleep(3000);
	WebElement e1 = driver.findElement(By.xpath("//button[@aria-label='Search' and @type='button']"));
	e1.click();
	WebElement e2 = driver.findElement(By.xpath("//input[@placeholder='Search medicines/Healthcare products']"));
	
	e2.sendKeys("PCM");
	Thread.sleep(3000);
 List<WebElement> e3 = driver.findElements(By.xpath("//div[@role='button' and @tabindex='0']/ancestor::div[contains(@class, module_results--withButton)][1]"));
	
	int n = e3.size();
	System.out.println(n);
	e3.get(3).click();
	Thread.sleep(3000);
	
	
	List<WebElement> e4 = driver.findElements(By.xpath("//h1[@class='ProductCard_medicineName__Uzjm7']"));
	
	int n1 = e4.size();
	System.out.println(n1);
	e4.get(2).click();
	Thread.sleep(3000);
	
	WebElement e5 = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
	e5.click();
	Thread.sleep(3000);
	driver.quit();
}
}