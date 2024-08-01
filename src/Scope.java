import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://moviesmod.zip");
		driver.findElement(By.cssSelector("input[id='s']")).click();
		driver.findElement(By.cssSelector("input[id='s']")).sendKeys("Demon Slayer");
		driver.findElement(By.cssSelector("button[id='search-image']")).click();
		
		WebElement searchedmovies = driver.findElement(By.cssSelector("div.post-cards"));
		//driver.findElement(By.cssSelector("div.search-toggle")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector("input.search-field")).sendKeys("Arkham");
		//Thread.sleep(3000);
		System.out.println(searchedmovies.findElements(By.tagName("article")).size());
		WebElement link;
		for(int i=0;i<searchedmovies.findElements(By.tagName("article")).size();i++)
		{
			String openthelink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			link=searchedmovies.findElements(By.tagName("article")).get(i);
			link.findElements(By.tagName("a")).get(1).sendKeys(openthelink);
			Thread.sleep(5000);
		}
		
		Thread.sleep(15000);
		Set<String> wh=driver.getWindowHandles();
		Iterator<String> i=wh.iterator();
		
		while(i.hasNext())
		{	
			
			driver.switchTo().window(i.next());
			System.out.println(driver.getTitle());
		}
		//driver.close();
		//driver.quit();
	}

}
