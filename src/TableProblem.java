import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableProblem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		//js.executeScript("document.querySelector('.	').scrollTop=5000");
		Thread.sleep(3000);
		
		// WebElement mytable = .findElement(By.className("tableFixHead"));
		WebElement tb=driver.findElement(By.cssSelector(".table-display"));
		
		System.out.println("Row Count: "+ String.valueOf(tb.findElements(By.tagName("tr")).size()));
		
		System.out.println("Column Count: "+ String.valueOf(tb.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size()));
		
		List<WebElement> data = tb.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		for(WebElement item : data)
		{
			System.out.println(item.getText());
		}
		
	}

}
