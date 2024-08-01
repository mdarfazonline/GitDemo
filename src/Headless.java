import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headless {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		Thread.sleep(3000);
		
		// WebElement mytable = .findElement(By.className("tableFixHead"));
		
		List<WebElement> tds = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		//System.out.println(mytable);
		
		int count=0;
		for(WebElement td: tds) {
			
			count=count+Integer.parseInt(td.getText());
			// System.out.println(td.getText()) ;
			
		}
		
		String total=driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim();
		
		
		int totalAmount = Integer.parseInt(total);
		
		if(totalAmount==count)
			System.out.println("Sum is correct");
	}

}
