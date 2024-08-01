import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	@SuppressWarnings({ "null", "deprecation" })
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		SoftAssert softAssert = new SoftAssert();
		List<String> allUrls = new ArrayList<String>() ;
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		int count=0;
		List<WebElement> columns = driver.findElements(By.cssSelector("table[class='gf-t'] td"));
		
		for(int i = 0;i<columns.size();i++)
		{
		List<WebElement> td =columns.get(i).findElements(By.tagName("li"));
		for(int j = 1;j<td.size();j++)
		{
			allUrls.add(td.get(j).findElement(By.tagName("a")).getAttribute("href"));
		}
		}
		//String url= driver.findElement(By.cssSelector("a[href*='broken']")).getAttribute("href");
		
		for(String url:allUrls)
		{
		HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respcode=conn.getResponseCode();
		softAssert.assertTrue(respcode<400, "The link with Text"+url+" is broken with code " +respcode);
		System.out.println(url+" : "+respcode);
		}
		
		softAssert.assertAll();
		
		driver.quit();
		 
	}

}
