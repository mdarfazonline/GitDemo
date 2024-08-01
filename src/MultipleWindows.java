import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://moviesmod.info");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handle= driver.getWindowHandles();
		Iterator<String> it=handle.iterator();
		String parentId=it.next();
		String childId=it.next();
		
		driver.switchTo().window(childId);
		driver.get("https://editorial.rottentomatoes.com/article/most-anticipated-movies-of-2024/");
		String movieName=driver.findElement(By.linkText("Monkey Man")).getText();
		
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("input[id='s']")).sendKeys(movieName);
		driver.findElement(By.cssSelector("button[id='search-image']")).click();
		
	}

}
