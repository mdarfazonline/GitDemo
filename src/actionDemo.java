import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
//		driver.findElement(By.cssSelector(".blinkingText")).click();
//		
//		Set<String> windows=driver.getWindowHandles();
//		Iterator<String> iter=windows.iterator();
//		String parentId = iter.next();
//		String childId = iter.next();
//		driver.switchTo().window(childId);
//		System.out.print(driver.findElement(By.cssSelector(".im-para.red")).getText());
//		String a =driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//		System.out.println(a);
//		driver.switchTo().window(parentId);
//		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys(a);
//		
		System.out.println("These are the updates");
		
	}
}
